public class Card {

    int suit;
    int value;
    String name;

    public Card() {



    }

    public int randomRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}
