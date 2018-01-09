public class Card  {

    int suit;
    int value;
    double nyum;
    String name;

    public Card(int suit, int value) {

        this.suit = suit;
        this.value = value;
        this.nyum = this.value + forNyum();

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

    public double forNyum() {

        if (this.suit == 1) {

            return .00;

        } else if (this.suit == 2) {

            return .25;

        } else if (this.suit == 3) {

            return .50;

        } else if (this.suit == 4) {

            return .75;

        }
        return 4.04;
    }



}
