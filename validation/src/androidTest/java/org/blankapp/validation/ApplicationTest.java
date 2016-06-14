package org.blankapp.validation;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.widget.CheckBox;
import android.widget.EditText;

import org.blankapp.validation.validators.DateValidator;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);


        EditText mEtUsername = new EditText(null);
        EditText mEtEmail = new EditText(null);
        EditText mEtName = new EditText(null);
        EditText mEtPassword = new EditText(null);
        EditText mEtAge = new EditText(null);
        CheckBox mCbAccepted = new CheckBox(null);

        Validator validator = new Validator();
        validator.add(Rule.with(mEtUsername).required().alphaDash().minLength(3).maxLength(32));
        validator.add(Rule.with(mEtEmail).required().email());
        validator.add(Rule.with(mEtName).required().after(DateValidator.NOW));
        validator.add(Rule.with(mEtPassword).required().minLength(6).maxLength(32));
        validator.add(Rule.with(mEtAge).numeric());
        validator.add(Rule.with(mCbAccepted).accepted());

        validator.validate();
        validator.liveValidate(true);
    }
}
