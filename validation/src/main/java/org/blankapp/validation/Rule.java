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

import android.view.View;

import org.blankapp.validation.validators.AcceptedValidator;
import org.blankapp.validation.validators.BaseValidator;
import org.blankapp.validation.validators.DateValidator;
import org.blankapp.validation.validators.EmailValidator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rule {

    public static Rule with(View view) {
        return new Rule(view);
    }

    private View mView;
    private List<BaseValidator> mValidators;

    public Rule() {
        this(null);
    }

    public Rule(View view) {
        this.mView = view;
        this.mValidators = new ArrayList<>();
    }

    public View getView() {
        return mView;
    }

    public Rule accepted() {
        mValidators.add(new AcceptedValidator());
        return this;
    }

    public Rule after(String date) {
        mValidators.add(new DateValidator());
        return this;
    }

    public Rule after(Date date) {
        mValidators.add(new DateValidator());
        return this;
    }

    public Rule alpha() {
        return this;
    }

    public Rule alphaDash() {
        return this;
    }

    public Rule alphaNum() {
        return this;
    }

    public Rule before(String date) {
        return this;
    }

    public Rule before(Date date) {
        return this;
    }

    public Rule between(int min, int max) {
        return this;
    }

    public Rule confirmed() {
        return this;
    }

    public Rule date() {
        return this;
    }

    public Rule dateFormat(String format) {
        return this;
    }

    public Rule digits(long value) {
        return this;
    }

    public Rule digitsBetween(int min, int max) {
        return this;
    }

    public Rule email() {
        mValidators.add(new EmailValidator());
        return this;
    }

    public Rule image() {
        return this;
    }

    public Rule in(String[] values) {
        return this;
    }

    public Rule in(String[] ... values) {
        return this;
    }

    public Rule integer() {
        return this;
    }

    public Rule ip() {
        return this;
    }

    public Rule json() {
        return this;
    }

    public Rule max(long value) {
        return this;
    }

    public Rule maxLength(long value) {
        return this;
    }

    public Rule mimes() {
        return this;
    }

    public Rule min(long value) {
        return this;
    }

    public Rule minLength(long value) {
        return this;
    }

    public Rule notIn(String[] values) {
        return this;
    }

    public Rule notIn(String[] ... values) {
        return this;
    }

    public Rule numeric() {
        return this;
    }

    public Rule regex(String pattern) {
        return this;
    }

    public Rule required() {
        return this;
    }

    public Rule same(String field) {
        return null;
    }

    public Rule size(int value) {
        return null;
    }

    public Rule url() {
        return this;
    }

    public Rule extend(Object object) {
        return this;
    }
}
