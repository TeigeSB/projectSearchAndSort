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

                if (allCards[i].nyum > allCards[i + 1].nyum) {

                    swap(i, i + 1);

                }

            }
        }
        return allCards;
    }

    public Card[] selectionSort() {

        int y = allCards.length;
        int lowArr = 0;
        Card lowVal;

        for (int j = 0; j < y; j++) {

            lowVal = allCards[j];

            for (int i = j; i < y; i++) {

                if (allCards[i].nyum <= lowVal.nyum) {

                    lowVal = allCards[i];
                    lowArr = i;

                }
            }
            swap(lowArr, j);
        }
        return allCards;
    }

    public void divide(int l, int m, int r) {

        int l1 = m - l + 1;
        int r1 = r - m;

        Card[] left = new Card[l1];
        Card[] right = new Card[r1];


        for (int i = 0; i < l1; ++i) {

            left[i] = allCards[l + i];
        }

        for (int j = 0; j < r1; ++j) {

            right[j] = allCards[m + 1 + j];

        }

        int k = l;
        int i = 0, j = 0;

        while(i < l1 && j < r1) {

            if (left[i].nyum <= right[j].nyum) {

                 allCards[k] = left[i];
                 i++;

            } else {

                allCards[k] = right[j];
                j++;

            }
            k++;
        }

        while (i < l1) {

            allCards[k] = left[i];
            i++;
            k++;

        }

        while (j < r1) {

            allCards[k] = right[j];
            j++;
            k++;

        }
    }

    public Card[] merge(int l , int r) {

        if (l < r) {

            int m = (l + r) / 2;

            merge(l, m);
            merge(m+1, r);

            divide(l, m, r);

        }
        return allCards;
    }

    public double binarySearch(double num, int l, int h) {



        if (h >= 1) {

            int mid = (l + h)/2;

            if (allCards[mid].nyum == num) {
                System.out.println(allCards[mid].nyum + " HI TEST correct");
                return allCards[mid].nyum;
            }
            if (allCards[mid].nyum > num) {
                System.out.println(allCards[mid].nyum + " lower");
                return binarySearch(num, l, mid - 1);
            }
            System.out.println(allCards[mid].nyum + " higher");
            return binarySearch(num, mid + 1, h);
        }
        System.out.println("Hi You failed.");
        return allCards[36].nyum;
    }


}
