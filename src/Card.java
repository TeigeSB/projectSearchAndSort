public class Card {

    int suit;
    int value;
    String name;

    public Card() {

        int suit = randomRange(1, 4);
        int value = randomRange(1,14);

    }

    public int randomRange(int min, int max)
    {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}
