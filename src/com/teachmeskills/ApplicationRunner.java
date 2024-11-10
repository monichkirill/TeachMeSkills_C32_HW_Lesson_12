package com.teachmeskills;

import com.teachmeskills.validator.HexValidator;
import com.teachmeskills.validator.UrlValidator;

public class ApplicationRunner {
    public static void main(String[] args) {
        String hexCode = "#8b2323";
        System.out.println(HexValidator.isValid(hexCode));

        String url = "https://teachmeskills.by/kursy/programmirovaniya-online";
        System.out.println(UrlValidator.isValid(url));
    }

}
