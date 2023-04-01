package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil implements IRegexUtil {

    final static String startWithCapitalLetterPattern = "^[A-Z]{1}[a-z]{2,}$";
    final static String isStartWithLastNameCapitalLetter = "^[A-Z]{1}[a-z]{2,}$";
    final static String validAddressEnter = "^[A-Z]{1}[a-z]{2,}$";
    final static String validCityName = "^[A-Z]{1}[a-z]{2,}$";
    final static String validStateName = "^[A-Z]{1}[a-z]{2,}$";
    final static String validZipCode = "^[1-9][0-9]{5}$";
    final static String validPhoneNumber = "^[1-9]{1}[0-9]{9}$";
    final static String validEmailID = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";

    @Override
    public boolean isStartWithCapitalLetter(String input) {
        Pattern pattern = Pattern.compile(startWithCapitalLetterPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean isStartWithLastNameCapitalLetter(String input) {
        Pattern pattern = Pattern.compile(isStartWithLastNameCapitalLetter);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean validAddressName(String input) {
        Pattern pattern = Pattern.compile(validAddressEnter);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean validCityName(String input) {
        Pattern pattern = Pattern.compile(validCityName);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean validStateName(String input) {
        Pattern pattern = Pattern.compile(validStateName);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean validZipCode(String input) {
        Pattern pattern = Pattern.compile(validZipCode);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean validPhoneNumber(String input) {
        Pattern pattern = Pattern.compile(validPhoneNumber);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    @Override
    public boolean validEmailID(String input) {
        Pattern pattern = Pattern.compile(validEmailID);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
