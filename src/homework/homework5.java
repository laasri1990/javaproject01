package homework;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter numbers of worked years");
        int years=scanner.nextInt();

        if(years>=5){
            System.out.println("you are eligible for the bonus .");
            System.out.println("please enter your annual salary :");
            int salary=scanner.nextInt();
            if(salary>50000){
                System.out.println("your bonus is : 5000");
            } else if (salary<50000) {
                System.out.println("your bonus is : 3000");
            }

        }else{
            System.out.println("you are not eligible for the bonus .");
        }

    }
}
/*Write a program to ask user to enter numbers of worked years and annual salary.
 If user worked for more or equals to 5 years than user is eligible for the bonus,
 otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
  otherwise bonus=3000.
 */