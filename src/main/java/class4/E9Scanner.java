package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your gender");
        char gender=scanner.next().charAt(0);
        System.out.println("your gender is "+gender);
    }
}
