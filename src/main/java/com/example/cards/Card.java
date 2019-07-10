package com.example.cards;

public class Card {

    private Symbols symbol;
    private Colors color;
    private CardValues value;

    public Card(Symbols symbol, Colors color, CardValues value) {
        this.symbol = symbol;
        this.color = color;
        this.value = value;
    }

    public Symbols getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbols symbol) {
        this.symbol = symbol;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public CardValues getValue() {
        return value;
    }

    public void setValue(CardValues value) {
        this.value = value;
    }
}
