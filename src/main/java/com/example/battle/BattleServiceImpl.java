package com.example.battle;

import com.example.cards.*;

import java.util.Scanner;

public class BattleServiceImpl implements BattleService {

    private Scanner sc = new Scanner(System.in);

    public Battle createBattle(int nbPlayers, CardPack pack) {

        Battle battle = new Battle();
        CardPackService cardPackService = new CardPackServiceImpl();

        for (int i = 0; i < nbPlayers; i++) {

            System.out.print("Nom du joueur " + (i + 1) + " : ");
            String name = sc.nextLine();
            battle.addPlayer(new Player(name));
        }

        for (int i = 0; i < pack.getCards().size(); i++) {
            for (int j = 0; j < nbPlayers; j++) {
                battle.getPlayers().get(j).giveCard(pack.pickCard());
            }
        }

        return battle;
    }

    public void playRound() {

    }
}
