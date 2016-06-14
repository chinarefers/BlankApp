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
import org.blankapp.validation.validators.AbstractValidator;
import org.blankapp.validation.validators.DateValidator;
import org.blankapp.validation.validators.RegexValidator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class Rule {

    public static Rule with(View view) {
        return new Rule(view);
    }

    private View view;
    private List<AbstractValidator> validators;

    public Rule() {
        this(null);
    }

    public Rule(View view) {
        this.view = view;
        this.validators = new ArrayList<>();
    }

    public View getView() {
        return view;
    }

    public Rule accepted() {
        validators.add(new AcceptedValidator());
        return this;
    }

    public Rule after(String date, String format) {
        return after(new Date());
    }

    public Rule after(Date date) {
        validators.add(new DateValidator(date));
        return this;
    }

    public Rule after(@DateValidator.DateTimes String datetime) {
        validators.add(new DateValidator(datetime));
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
        this.validators.add(new RegexValidator(RegexValidator.Patterns.EMAIL_ADDRESS));
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
        this.validators.add(new RegexValidator(RegexValidator.Patterns.IP_ADDRESS));
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
        this.validators.add(new RegexValidator(pattern));
        return this;
    }

    public Rule regex(Pattern pattern) {
        this.validators.add(new RegexValidator(pattern));
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
        this.validators.add(new RegexValidator(RegexValidator.Patterns.WEB_URL));
        return this;
    }

    public Rule extend(Object object) {
        return this;
    }
}