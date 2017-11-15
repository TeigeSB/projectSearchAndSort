import java.util.Arrays;
import java.util.Collections;

public class Deck {

    Card[] allCards;
    Card[] hand;
    boolean Deck;

    public Deck (boolean Deck) {

        if (Deck) {

            allCards = new Card[52];

            for (int i = 0; i < 52; i++) {

                allCards[i] = new Card();

            }

        } else {

            allCards = new Card[13];

            for (int j = 0; j < 13; j++) {

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
            hand[i] = allCards[i];
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

        int y = 50;

        for (int j = 0; j < y; j += 2) {

            for (int i = 0; i < (allCards.length - 2); i++) {

                if (allCards[i].value > allCards[i + 1].value) {

                    swap(i, i + 1);
                    y -= 2;

                }

            }
        }
        System.out.println(allCards);
        return allCards;
    }




}
