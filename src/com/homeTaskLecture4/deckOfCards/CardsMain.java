package com.homeTaskLecture4.deckOfCards;

public class CardsMain {
    public static void main(String[] args) {
        //first card
        Card card3 = new Card("Ace", "pika");
        System.out.println(card3.getRank() + " " + card3.getSuit());
        //second card
        Card card2 = new Card();
        card2.setRank("10");
        card2.setSuit("buba");
        System.out.println(card2.getRank() + " " + card2.getSuit());
        Deck deck = new Deck();
        deck.addAllCardsToDeck();
        deck.printDeck();
        Deck deck2 = new Deck();
        deck2.deckCreation();


    }

}
