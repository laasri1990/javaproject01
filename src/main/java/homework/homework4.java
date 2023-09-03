package homework;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you have a credit card");
        String creditcard = scanner.next();

        if (creditcard.equals("yes")) {
            System.out.println("what is your balance ? ");

            int balance = scanner.nextInt();
            if (balance > 1000) {
                System.out.println("you need to pay off immediately");
            } else {
                System.out.println("you can spend more");
            }if (creditcard.equals("no")) {
            }
        } else {
            System.out.println("we can offer you a credit card");
        }
    }
}

/*Create a Java program that will ask if user has a credit card or not.
 If you user does not have a credit card then offer them.
  If they do have one ask what is balance on the card?
  If balance of the card is larger than 1000, tell them to pay off immediately,
  otherwise you can tell them that they can spend more.
 */