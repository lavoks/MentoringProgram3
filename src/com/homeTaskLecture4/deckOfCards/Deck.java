package com.homeTaskLecture4.deckOfCards;

public class Deck {

    private Card[] deck = new Card[52];

    private static String[] rankArray = {"2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Jack ", "Queen ", "King ", "Ace "};
    private static String[] suitArray = {"Hresta", "Chirva", "Buba", "Pika"};

    public Deck(){

    }

    public void addAllCardsToDeck() {
        int index = 0;
        for (int i = 0; i < rankArray.length; i++) {
            for (int j = 0; j < suitArray.length; j++) {
                deck[index] = new Card(rankArray[i], suitArray[j]);
                index++;
            }
        }
    }

    public void printDeck() {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].getRank() + deck[i].getSuit());
        }
    }

    public void deckCreation() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(rankArray[i % 13], suitArray[i / 13]);
            System.out.println(deck[i].getRank() + deck[i].getSuit());
        }
    }



}
