package com.example.cards;

import java.util.Arrays;
import java.util.List;

public class CardPackServiceImpl implements CardPackService {

    public CardPack createClassicPack() {
        // classic pack (52 cards)

        CardPack pack = new CardPack();

        List<CardValues> cardsValues = Arrays.asList(CardValues.values());
        List<Symbols> symbols = Arrays.asList(Symbols.values());

        for (Symbols symbol : symbols) {
            for (CardValues cardsValue : cardsValues) {
                pack.addCard(new Card(symbol, cardsValue));
            }
        }

        return pack;
    }
}
