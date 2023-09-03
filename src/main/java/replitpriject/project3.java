package replitpriject;

import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        char gender=scanner.next().charAt(0);

        System.out.println("Please enter your age ");
        int age=scanner.nextInt();

        if(age<25){

        }else if(gender=='F'||gender=='f'){
            System.out.println("Woman");
        }else{
            System.out.println("Man");
        }if(age>25){

        }else if(gender=='f'||gender=='F'){
            System.out.println("Girl");
        }else{
            System.out.println("Boy");
        }






    }
}

/*Ask the user to enter his/her gender "Please enter your age""1: M or F" and their age

You have 2 conditions:

If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"

If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"*/