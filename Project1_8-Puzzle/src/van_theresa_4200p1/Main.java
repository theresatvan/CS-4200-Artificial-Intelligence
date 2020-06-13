/******************************************************************************
 *      author: Theresa Van
 *      file: Main.java
 *      class: CS 4200-01 Artificial Intelligence
 *
 *      description: This file will contain the UI.
 ******************************************************************************/

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println(" Choose an option (1-3)");
            System.out.println("    1 - Generate a random 8-puzzle problem");
            System.out.println("    2 - Enter a specific 8-puzzle configuration");
            System.out.println("    3 - Generate 1000 test cases");
            System.out.println("    0 - Exit");

            System.out.println(" Enter an option: ");
            option = input.nextInt();

            if (option == 1)
                break;

            if (option == 2)
                break;

            if (option == 3)
                break;
        } while (option != 0);
    }
}