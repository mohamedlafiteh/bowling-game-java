package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BowlingGame game = new BowlingGame();
        Scanner input = new Scanner(System.in);
        String player;
        System.out.print("Enter your name: ");
        player = input.next();
        System.out.println("Welcome to the game  " + player);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter your score for Roll #1: ");
            int s1 = input.nextInt();
            int n1;
            if(s1==10){
                game.roll(s1);
                 n1 = game.getScore();
                System.out.println("Total " + n1);

                 continue;
            }
            System.out.print("Enter your score for Roll #2: ");
            int s2 = input.nextInt();
            game.roll(s2);
            int n2 = game.getScore();
            System.out.println("Total " + n2);
        }

    }
}
