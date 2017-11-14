public class Runner {

    public static void main(String[] args) {
        Deck d = new Deck(true);
        d.shuffleDeck();
        d.bubbleSort();
        d.dealHand(7);
        d.listHand();
    }



}
