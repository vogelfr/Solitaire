package ch.vogelfrederic;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            Game game = new Game();
            game.drawStack();
            game.print();
            Scanner in = new Scanner(System.in);
            while (true) {
                String next = in.next().toLowerCase();

                if (next.equals("help")) {
                    System.out.println();
                    System.out.print("Press \"m\" to move cards\n");
                    System.out.print("Press \"d\" to draw from the stack\n");
                    System.out.print("Press \"new\" to start a new game\n");
                    System.out.print("Press \"redraw\" to redraw the game\n");
                    System.out.print("Press \"quit\" to quit the game\n");
                    System.out.print("Press \"size\" to print the size of the stack\n");
                    System.out.println();
                } else if (next.equals("m")) {
                    int from = in.nextInt();
                    int to = in.nextInt();
                    int number = in.nextInt();

                    game.move(from, to, number);
                    game.print();
                } else if (next.equals("d")) {
                    game.drawStack();
                    game.print();
                } else if (next.equals("new")) {
                    break;
                } else if (next.equals("redraw")) {
                    game.print();
                } else if (next.equals("quit")) {
                    break;
                } else if (next.equals("size")) {
                    game.printSize();
                } else {
                    System.out.print("Unknown command, please try again\n");
                }

                if (game.win()) {
                    System.out.print("*****************\n");
                    System.out.print("*****YOU WON*****\n");
                    System.out.print("*****************\n");
                    System.out.print("**TO PLAY AGAIN**\n");
                    System.out.print("***ENTER \"new\"***\n");
                    System.out.print("*****************\n");
                }
            }
        }
    }
}
