package com.example.cards;

import java.util.*;

public class CardPack {

    private List<Card> cards;

    public CardPack() {
        this.cards = new ArrayList<Card>();
    }

    public Card pickCard() {

        Random r = new Random();
        int randn = r.nextInt((0 - cards.size()) + 1);
        Card pickedCard = cards.get(randn);
        cards.remove(randn);
        return pickedCard;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
