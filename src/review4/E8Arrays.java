package review4;

import java.util.Scanner;

public class E8Arrays {

    public static void main(String[] args) {


        String []days=new String[7];
        Scanner scanner=new Scanner(System.in);



        for (int i= 0; i < days.length; i++) {
            System.out.println("please entere day "+i+ " of the week"); // ae can add 1 to i (i+1)
            days[i]=scanner.next();

        }
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

    }
}
