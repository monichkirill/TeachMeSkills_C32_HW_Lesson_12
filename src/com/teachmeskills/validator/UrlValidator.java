package com.teachmeskills.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.constants.Constants.URL_REGEX;

public class UrlValidator {
    public static String isValid(String url) {
        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches() ? "YES" : "NO";
    }
}
