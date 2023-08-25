package class5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 10) {
            System.out.println("your number is small");
        } else if (number >= 11 && number <= 100) {
            System.out.println("your number is medium");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("your number is large");
        }

    }
}
