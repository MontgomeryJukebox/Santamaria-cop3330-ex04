/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 David Santamaria
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a noun:");
        String noun = in.next();
        System.out.print("Enter a verb:");
        String verb = in.next();
        System.out.print("Enter an adjective:");
        String adjective = in.next();
        System.out.print("Enter an adverb:");
        String adverb = in.next();
        System.out.println("Do you walk your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}