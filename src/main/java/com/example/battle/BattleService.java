package com.example.battle;

import com.example.cards.CardPack;

public interface BattleService {

    public Battle createBattle(int nbPlayers, CardPack pack);
    public void playRound();
}
