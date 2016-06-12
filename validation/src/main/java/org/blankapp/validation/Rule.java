package org.blankapp.validation;

import android.view.View;

import java.util.Date;

public class Rule {

    public static int ACCEPTED;             // Accepted
    public static int AFTER;                // After (Date)
    public static int ALPHA;                // Alpha
    public static int ALPHA_DASH;           // Alpha Dash
    public static int ALPHA_NUM;            // Alpha Numeric
    public static int BEFORE;               // Before (Date)
    public static int BETWEEN;              // Between
    public static int BOOLEAN;              // Boolean
    public static int CONFIRMED;            // Confirmed
    public static int DATE;                 // Date
    public static int DATE_FORMAT;          // Date Format
    public static int DIFFERENT;            // Different
    public static int DIGITS;               // Digits
    public static int DIGITS_BETWEEN;       // Digits Between
    public static int EMAIL;                // E-Mail
    public static int IMAGE;                // Image (File)
    public static int IN;                   // In
    public static int INTEGER;              // Integer
    public static int IP;                   // IP Address
    public static int JSON;                 // JSON
    public static int MAX;                  // Max
    public static int MIMES;                // MIME Types (File)
    public static int MIN;                  // Min
    public static int NOT_IN;               // Not In
    public static int NUMERIC;              // Numeric
    public static int REGEX;                // Regular Expression
    public static int REQUIRED;             // Required
    public static int REQUIRED_IF;          // Required If
    public static int REQUIRED_UNLESS;      // Required Unless
    public static int REQUIRED_WITH;        // Required With
    public static int REQUIRED_WITH_ALL;    // Required With All
    public static int REQUIRED_WITHOUT;     // Required Without
    public static int REQUIRED_WITHOUT_ALL; // Required Without All
    public static int SAME;                 // Same
    public static int SIZE;                 // Size
    public static int STRING;               // String
    public static int TIMEZONE;             // Timezone
    public static int URL;                  // URL

    public static Rule with(View view) {
        return new Rule();
    }

    public Rule accepted() {
        return null;
    }

    public Rule after(String date) {
        return null;
    }

    public Rule after(Date date) {
        return null;
    }

    public Rule alpha() {
        return null;
    }

    public Rule alphaDash() {
        return null;
    }

    public Rule alphaNum() {
        return null;
    }

    public Rule before(String date) {
        return null;
    }

    public Rule before(Date date) {
        return null;
    }

    public Rule between(int min, int max) {
        return null;
    }

    public Rule bool() {
        return null;
    }

    public Rule confirmed() {
        return null;
    }

    public Rule date() {
        return null;
    }

    public Rule dateFormat(String format) {
        return null;
    }

    public Rule different(String field) {
        return null;
    }

    public Rule digits(long value) {
        return null;
    }

    public Rule digitsBetween(int min, int max) {
        return null;
    }

    public Rule email() {
        return null;
    }

    public Rule image() {
        return null;
    }

    public Rule in(String[] values) {
        return null;
    }

    public Rule in(String[] ... values) {
        return null;
    }

    public Rule integer() {
        return null;
    }

    public Rule ip() {
        return null;
    }

    public Rule json() {
        return null;
    }

    public Rule max(long value) {
        return null;
    }

    public Rule maxLength(long value) {
        return null;
    }

    public Rule mimes() {
        return null;
    }

    public Rule min(long value) {
        return null;
    }

    public Rule minLength(long value) {
        return null;
    }

    public Rule notIn(String[] values) {
        return null;
    }

    public Rule notIn(String[] ... values) {
        return null;
    }

    public Rule numeric() {
        return null;
    }

    public Rule regex(String pattern) {
        return null;
    }

    public Rule required() {
        return null;
    }

    public Rule requiredIf() {
        return null;
    }

    public Rule requiredUnless() {
        return null;
    }

    public Rule requiredWith() {
        return null;
    }

    public Rule requiredWithAll() {
        return null;
    }

    public Rule requiredWithout() {
        return null;
    }

    public Rule requiredWithoutAll() {
        return null;
    }

    public Rule same(String field) {
        return null;
    }

    public Rule size(int value) {
        return null;
    }

    public Rule string() {
        return null;
    }

    public Rule timezone() {
        return null;
    }

    public Rule url() {
        return this;
    }

    public Rule extend(Object object) {
        return this;
    }
}
