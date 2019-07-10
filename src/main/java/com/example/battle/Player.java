package com.example.battle;
import com.example.cards.Card;

import java.util.List;

public class Player {

    private String nom;
    private List<Card> cards;


    public Player(String nom, List<Card> cards) {
        this.nom = nom;
        this.cards = cards;
    }

    public void giveCard(Card card){
        cards.add(card);
    }

    public void giveCards(List<Card> cards){
        for (Card card : cards){
            cards.add(card);
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
