package com.nandhini.bankapp.abcbank.utils;

import com.nandhini.bankapp.abcbank.enums.Currency;

import static com.nandhini.bankapp.abcbank.enums.Currency.*;


public class CurrencyUtils {

    public static Currency convertStringToCurrency (String currency) {
        switch (currency.toLowerCase()) {
            case "euro":
                return EURO;
            case "swedishkrona":
                return SWEDISHKRONA;
            case "pound":
                return POUND;
            default:
                return EURO;

        }
    }
}
