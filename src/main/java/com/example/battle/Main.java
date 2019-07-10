package com.example.battle;

import com.example.cards.*;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        System.out.println("----- Bataille -----");

        final BattleService battleService = new BattleServiceImpl();
        final CardPackService cardPackService = new CardPackServiceImpl();

        CardPack cardPack = cardPackService.createClassicPack();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de joueurs : ");
        int nbPlayers = sc.nextInt();

        Battle battle = battleService.createBattle(nbPlayers, cardPack);

        System.out.println(battle);
    }
}
