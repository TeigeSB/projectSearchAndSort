public class Runner {

    public static void main(String[] args) {
        Deck d = new Deck(true);
        d.shuffleDeck();
        d.selectionSort();
        d.divide();
        d.dealHand(7);
        d.bubbleSort();
        d.listHand();
        for (int i = 0; i < 52; i++) {

            System.out.println(d.allCards[i].getValue());

        }
    }



}
