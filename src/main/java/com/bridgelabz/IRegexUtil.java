package com.bridgelabz;

public interface IRegexUtil {

    boolean isStartWithCapitalLetter(final String input);
    boolean isStartWithLastNameCapitalLetter(final String input);
    boolean validAddressName(final String input);
    boolean validCityName(final String input);
    boolean validStateName(final String input);
    boolean validZipCode(final String input);
    boolean validPhoneNumber(final String input);
    boolean validEmailID(final String input);
}
