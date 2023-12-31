package homeworkweek8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * PRIME TESTING
 * *****
 * ***
 * *
 */
public class Programme14DiamondPattern {
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            System.out.println(" ");
        }
        j = 1;
        while (j++ <= i * 2 - 1) {
            System.out.println(ch);
        }
        System.out.println();
        i++;

        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.println(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.println(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row :");
        int a = scanner.nextInt();
        System.out.println("Enter the symbol :");
        char c = scanner.next().charAt(0);
        printDiamond(a, c);
        //closing the scanner object
        scanner.close();
    }
}
