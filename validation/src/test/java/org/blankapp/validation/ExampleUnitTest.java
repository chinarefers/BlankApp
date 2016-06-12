package org.blankapp.validation;

import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        EditText mEtUsername = new EditText(null);
        EditText mEtEmail = new EditText(null);
        EditText mEtName = new EditText(null);
        EditText mEtPassword = new EditText(null);
        EditText mEtAge = new EditText(null);
        CheckBox mCbAccepted = new CheckBox(null);

        Validator validator = new Validator();
        validator.setErrorHandler(new ErrorHandler() {
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        });

        validator.addRule(Rule.with(mEtUsername).required().alphaDash().minLength(3).maxLength(32));
        validator.addRule(Rule.with(mEtEmail).required().email());
        validator.addRule(Rule.with(mEtName).required());
        validator.addRule(Rule.with(mEtPassword).required().minLength(6).maxLength(32));
        validator.addRule(Rule.with(mEtAge).numeric());
        validator.addRule(Rule.with(mCbAccepted).accepted().url());

        if (validator.isValid()) {
            // TODO
        }
        validator.validate();
        validator.liveValidate();
    }
}
