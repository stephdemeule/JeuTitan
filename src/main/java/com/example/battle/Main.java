package com.example.battle;

import com.example.cards.*;

public class Main {

    public static void main(String args[]) {

        System.out.println("----- Card battle -----");

        CardPackService cardPackService = new CardPackServiceImpl();
        CardPack cardPack = cardPackService.createClassicPack();

        System.out.println(cardPack);
    }
}
