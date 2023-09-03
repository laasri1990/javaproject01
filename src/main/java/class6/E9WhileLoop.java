package class6;

import java.util.Scanner;

public class E9WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your starting point");
        int start = scanner.nextInt();

        System.out.println("please enter your ending point");
        int end = scanner.nextInt();

        System.out.println("please enter the steps as well");
        int step = scanner.nextInt();

        while (start <= end) {

            System.out.println(start);

            start += step;
        }
    }
}
