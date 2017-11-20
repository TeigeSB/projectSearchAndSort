import java.util.Arrays;
import java.util.Collections;

public class Deck {

    Card[] allCards;
    Card[] hand;
    boolean Deck;

    public Deck (boolean Deck) {

        if (Deck) {

            int count = 0;
            allCards = new Card[52];

            for (int j = 1; j <= 4; j++) {
                for (int i = 1; i <= 13; i++) {

                    allCards[count] = new Card(j, i);
                    count++;
                }
            } if (!Deck) {

                allCards = new Card[13];

                //for (int j = 0; j < 13; j++) {

                //   allCards[j] = new Card();

                //}

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
            System.out.println(hand[i].getName());

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

        int y = allCards.length;

        for (int j = 0; j < y; j += 1) {

            for (int i = 0; i < (y - 1); i++) {

                if (allCards[i].getValue() > allCards[i + 1].getValue()) {

                    swap(i, i + 1);

                }

            }
        }
        return allCards;
    }

    public Card[] selectionSort() {

        int y = allCards.length;

        for (int j = 0; j < y; y++) {

            for (int i = 0; i < (y - 1); i++) {

                if (allCards[i].getValue() > allCards[i + 1].getValue()) {

                    swap(i, i - i);

                }

            }
        }


        return allCards;
    }




}
