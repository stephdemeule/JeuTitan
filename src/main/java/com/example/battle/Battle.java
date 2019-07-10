package com.example.battle;

import com.example.cards.*;

import java.util.ArrayList;
import java.util.List;

public class Battle {

    private List<Player> players;
    private List<Card> hand;

    public Battle() {
        this.players = new ArrayList<Player>();
        this.hand = new ArrayList<Card>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void putCard(Card card) {

        hand.add(card);
    }

    public void resetHand() {
        hand = new ArrayList<Card>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
