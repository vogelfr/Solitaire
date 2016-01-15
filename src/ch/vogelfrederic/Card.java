package ch.vogelfrederic;

/**
 * Created by vogelfr on 04.09.2015.
 */
public class Card {

    public boolean red;

    private boolean visible;

    int value;

    int color;

    public Card (int value, int color) {
        this.red = color < 2? true : false;
        this.value = value;
        this.color = color;
        this.visible = false;
    }


    public void print() {
        String[] colors2 = {"♦","♥","♣","♠"};
        String[] colors = {"K","H","T","P"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        if (visible) {
            System.out.print(colors[color] + values[value]);
        } else {
            System.out.print("--");
        }
    }

    public void makeVisible() {
        visible = true;
    }

    public boolean isVisible() {
        return visible;
    }
}