package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();
        System.out.println("your age is "+age);*/
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");
        String name=scanner.nextLine();

        System.out.println("Enter your mobile number");
        String mobilenumber=scanner.nextLine();

        System.out.println("Enter your age");
        int age=scanner.nextInt();

        System.out.println("your name is "+name+", your age is "+age+" and your mobile number is "+mobilenumber);


    }
}
