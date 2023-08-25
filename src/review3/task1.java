package review3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your second value");
        boolean input1 = scanner.nextBoolean();
        System.out.println("please enter your second value");
        boolean input2 = scanner.nextBoolean();


       if(input1&&input2){
           System.out.println("value is true");
       }else{
           System.out.println("value is false");
       }

    }
}


/*Ask the user to input two boolean values (true or false).
Use the logical AND operator (&&) to determine if both are true.
//Display the result to the user.*/