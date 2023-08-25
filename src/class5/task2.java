package class5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);  // M=upperCase         m=lowerCase

        System.out.println("Please enter your heights in inches");

        int height=scanner.nextInt();

        if(height<60){
            System.out.println("your height is short");
        }else if(height>=60 && height<=72){
            System.out.println("your height is medium");
        }else if(height>72){
            System.out.println("your height is tall");
        }

    }
}
