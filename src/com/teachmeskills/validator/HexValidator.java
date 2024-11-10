package com.teachmeskills.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.constants.Constants.HEX_CODE_REGEX;

public class HexValidator {
    public static String isValid(String hex) {
        Pattern pattern = Pattern.compile(HEX_CODE_REGEX);
        Matcher matcher = pattern.matcher(hex);
        return matcher.matches() ? "YES" : "NO";
    }
}
