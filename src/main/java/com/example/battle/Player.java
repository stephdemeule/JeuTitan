package com.example.battle;

import com.example.cards.*;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> cards;


    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();
    }

    public void giveCard(Card card){
        cards.add(card);
    }

    public void giveCards(List<Card> cards){
        for (Card card : cards){
            cards.add(card);
        }
    }

    public void pullCard(Card card) {
        cards.remove(cards.indexOf(card));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
