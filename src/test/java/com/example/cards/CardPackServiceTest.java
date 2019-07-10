package com.example.cards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardPackServiceTest {

    @Test
    void createClassicPack() {
        final com.example.cards.CardPackService cardPackService = new CardPackServiceImpl();
        final int expectedNbCards = 52;

        CardPack cardPack = cardPackService.createClassicPack();
        int nbCards = cardPack.getCards().size();

        assertEquals(expectedNbCards, nbCards);
    }
}
