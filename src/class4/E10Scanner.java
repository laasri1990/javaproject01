package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.nextLine();// we add line to next to print more than one word
        System.out.println("your full name is "+name);
    }
}
