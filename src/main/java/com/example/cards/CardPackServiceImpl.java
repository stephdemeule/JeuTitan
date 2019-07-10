package com.example.cards;

public class CardPackServiceImpl implements CardPackService {

    public CardPack createClassicPack() {
        // classic pack (52 cards)

        CardPack pack = new CardPack();
        pack.addCard(new Card(Symbols.CARREAU, CardValues.AS));

        return pack;
    }
}
