package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class occur {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the star pattern

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}


