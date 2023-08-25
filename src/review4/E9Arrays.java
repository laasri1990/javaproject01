package review4;

import java.util.Scanner;

public class E9Arrays {

    public static void main(String[] args) {


        int [] num=new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int i= 0; i < num.length; i++){
            num[i]=scanner.nextInt();

        } for (int i = 0; i<num.length ; i++) {
            System.out.println(num[i]*10);

        }

    }
}
