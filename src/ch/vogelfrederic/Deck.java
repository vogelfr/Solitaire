package ch.vogelfrederic;
import java.util.*;

/**
 * Created by vogelfr on 04.09.2015.
 */
public class Deck{

    public  ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (int c = 0; c < 4 ; c++) {
            for (int v = 0; v < 13; v++) {
                Card card = new Card(v, c);
                //card.visible = true;
                cards.add(card);
            }
        }
    }

    public Card getCard() {
        return cards.remove(0);
    }

    public void shuffle() {
        ArrayList<Card> newDeck = new ArrayList<Card>();
        for (int i = 0; i < 51; i++) {
            int rand = new Random().nextInt(cards.size());
            newDeck.add(cards.remove(rand));
        }
        newDeck.add(cards.remove(0));
        cards = newDeck;
    }

    public void print() {
        for (int i = 0; i < 52; i++) {
            Card card = cards.get(i);
            card.makeVisible();
            card.print();
            System.out.println();
        }
    }


}
