public class Runner {

    public static void main(String[] args) {
        Deck d = new Deck(true);
        d.shuffleDeck();
        for (int i = 0; i < 52; i++) {

            System.out.println(d.allCards[i].getValue());

        }
        d.selectionSort();
        for (int i = 0; i < 52; i++) {

            System.out.println(d.allCards[i].getValue());

        }
        d.dealHand(7);
        d.listHand();
    }



}
