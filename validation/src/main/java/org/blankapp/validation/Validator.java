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

import java.util.LinkedHashSet;
import java.util.Set;

public class Validator {

    private Context mContext;
    private Set<Rule> mRules;
    private ErrorHandler mErrorHandler;
    private ValidatorListener mValidatorListener;

    public Validator() {
        this(null, null);
    }

    public Validator(Context context) {
        this(context, null);
    }

    public Validator(Context context, ErrorHandler errorHandler) {
        this.mContext = context;
        this.mErrorHandler = errorHandler;
        this.mRules = new LinkedHashSet<>();
    }

    public void addRule(Rule rule) {
        mRules.add(rule);
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

    public ValidatorListener getValidatorListener() {
        return mValidatorListener;
    }

    public void setValidatorListener(ValidatorListener validatorListener) {
        this.mValidatorListener = validatorListener;
    }

    public boolean isValid() {
        return true;
    }

    public boolean isInvalid() {
        return true;
    }
}
