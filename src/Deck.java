import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck {

    Card[] allCards;
    Card[] hand;
    boolean Deck;

    public Deck (boolean Deck) {

        if (Deck) {

            for (int i = 0; i < 52; i++) {

                allCards = new Card[52];
                allCards[i] = new Card();

            }

        } else {

            for (int j = 0; j < 13; j++) {

                allCards = new Card[13];
                allCards[j] = new Card();

            }

        }

    }

    public void swap(int first, int second) {

        Card one = allCards[first];
        Card two = allCards[second];
        allCards[first] = two;
        allCards[second] = one;

    }

    public Card[] dealHand(int numCards) {

        for (int i = 0; i < numCards; i++) {

            hand = new Card[numCards];
            hand[i] = new Card();
            System.out.println(hand[i]);

        }
        return hand;

    }

    public Card[] listHand() {

        return hand;

    }

    public void shuffleDeck(){

        Collections.shuffle(Arrays.asList(allCards));

    }

    public Card[] bubbleSort() {

        for (int i = 0; i < (allCards.length - 2); i++) {

            if (allCards[i].value > allCards[i + 1].value) {

                swap(i, i + 1);

            }

        }
        return allCards;
    }




}
