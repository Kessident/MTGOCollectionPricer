package com.Windspinks.MTGOPricer;

public enum MtGSet {
    SETNAME ("ShortName 3##", 123);

    private String shortName;
    private int numberOfCards;

    MtGSet() {
    }

    MtGSet(String shortName, int numberOfCards) {
        this.shortName = shortName;
        this.numberOfCards = numberOfCards;
    }
}
