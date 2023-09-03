package review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter name of fruit");
        String fruit= scanner.next();

        switch (fruit){
            case "Orange":
                System.out.println("it is usually orange");
                break;
            case "Banana":
                    System.out.println("yellow bananas are good");
                    break;
            case "Strawberry":
                System.out.println("i like red Strawberry");
                break;
            default:
                System.out.println("i don't like this fruit");

        }


    }
}
