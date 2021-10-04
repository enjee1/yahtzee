package com.company;

public class Player {
    private String name;
    private Hand hand;
    private ScoreCard scoreCard;

    public Player(String name, ScoreCard sCard) {
        this.name = name;
        this.scoreCard = sCard;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public String getName() {
        return name;
    }
}
