package com.Windspinks.MTGOPricer;

public enum Rarity {
    COMMON ('C'),
    UNCOMMON ('U'),
    RARE ('R'),
    MYTHIC ('M'),
    PROMO ('P');

//    private String singleCharacter;
    private Character singleCharacter;

    Rarity() {
    }

    Rarity(Character singleCharacter) {
        this.singleCharacter = singleCharacter;
    }
}
