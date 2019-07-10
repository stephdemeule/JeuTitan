package com.example.cards;

public enum CardValues {
    N2(2),
    N3(3),
    N4(4),
    N5(5),
    N6(6),
    N7(7),
    N8(8),
    N9(9),
    N10(10),
    VALET(11),
    DAME(12),
    ROI(13),
    AS(14);

    private final int value;

    CardValues(int value) {

        this.value = value;
    }

    public int getValue() {

        return value;
    }
}
