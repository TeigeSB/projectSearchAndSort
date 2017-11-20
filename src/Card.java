public class Card  {

    int suit;
    int value;
    String name;

    public Card(int suit, int value) {

        this.suit = suit;
        this.value = value;

    }

    public String getName() {

        if (suit == 1) {

            checkHigh(" Spades");

        } else if (suit == 2) {

            checkHigh(" Clubs");

        } else if (suit == 3) {

            checkHigh(" Hearts");

        } else if (suit == 4) {

            checkHigh(" Diamonds");

        }
        return name;
    }

    public int getValue() {

        return value;

    }

    public void checkHigh(String chek) {

        if (value == 1) {

            this.name = "Ace of" + chek;

        } else if (value == 11) {

            this.name = "Jack of" + chek;

        } else if (value == 12) {

            this.name = "Queen of" + chek;

        } else if (value == 13) {

            this.name = "King of" + chek;

        } else {

            this.name = value + chek;

        }

    }

}
