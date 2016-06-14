/**
 * Copyright (C) 2015 JianyingLi <lijy91@foxmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.blankapp.validation;

import android.content.Context;

import org.blankapp.validation.helpers.DefaultHandler;
import org.blankapp.validation.validators.AbstractValidator;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private Context mContext;
    private List<Rule> mRules;
    private ErrorHandler mErrorHandler;
    private ValidationListener mValidationListener;

    private boolean mLiveMode = false;

    public Validator() {
        this(null, null);
    }

    public Validator(Context context) {
        this(context, null);
    }

    public Validator(Context context, ErrorHandler errorHandler) {
        this.mContext = context;
        this.mErrorHandler = errorHandler;
        this.mRules = new ArrayList<>();
    }

    public void add(Rule rule) {
        this.add(rule, null);
    }

    public void add(Rule rule, ValidationListener validationListener) {
        mRules.add(rule);
    }

    public List<Rule> getRules() {
        return mRules;
    }

    public ErrorHandler getErrorHandler() {
        if (mErrorHandler == null) {
            mErrorHandler = new DefaultHandler();
        }
        return mErrorHandler;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.mErrorHandler = errorHandler;
    }

    public ValidationListener getValidatorListener() {
        return mValidationListener;
    }

    public void setValidatorListener(ValidationListener validationListener) {
        this.mValidationListener = validationListener;
    }

    @SuppressWarnings("unchecked")
    public boolean validate() {
        List<ValidationError> validationErrors = new ArrayList<>();
        for (Rule rule : mRules) {
            for (AbstractValidator validator : rule.getValidators()) {
                if (!validator.isValid(rule.getViewValue())) {
                    validationErrors.add(new ValidationError());
                }
            }
        }
        if (validationErrors.size() > 0) {
            return false;
        }
        return true;
    }

    public void liveValidate() {
        this.liveValidate(true);
    }

    public void liveValidate(boolean enable) {
        mLiveMode = enable;
    }

}
