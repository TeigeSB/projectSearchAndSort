public class Runner {

    public static void main(String[] args) {
        Deck d = new Deck(true);
        //d.shuffleDeck();
        d.selectionSort();
        //d.merge(0, 51);
        d.binarySearch(10.75, 0, 51);
        //d.dealHand(7);
        //d.bubbleSort();
        //d.listHand();
        for (int i = 0; i < 52; i++) {

            System.out.println(d.allCards[i].getValue());

        }
    }



}
