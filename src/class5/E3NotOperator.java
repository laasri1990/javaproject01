package class5;

import java.util.Scanner;

public class E3NotOperator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of your country");

        String country=input.nextLine();  // input or scanner is just a variable

        if(!country.equals("Iran")){
            System.out.println("Welcome you are allowed");
        }else{
            System.out.println("you are not allowed");
        }

    }
}
