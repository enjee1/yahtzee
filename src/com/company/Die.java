package com.company;

public class Die {
    private final int SIX_SIDED = 6;
    private int sides;
    private int value;

    public Die() {
        this.sides = SIX_SIDED;
    }

    public void roll() {
        value = (int) (Math.random() * sides + 1);
    }
}
