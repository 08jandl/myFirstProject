package fh.campus02.fundamentals;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number, then press enter: ");

        int number = reader.nextInt();

        System.out.println("You entered: " + number);
    }
}
