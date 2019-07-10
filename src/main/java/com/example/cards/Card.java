package com.example.cards;

public class Card {

    private Symbols symbol;
    private CardValues value;

    public Card(Symbols symbol, CardValues value) {
        this.symbol = symbol;
        this.value = value;
    }

    public Symbols getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbols symbol) {
        this.symbol = symbol;
    }

    public CardValues getValue() {
        return value;
    }

    public void setValue(CardValues value) {
        this.value = value;
    }
}
