package class7;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {


        int [] num=new int[5];
        Scanner scanner=new Scanner(System.in);

        for (int i= 0; i < num.length; i++){
            num[i]=scanner.nextInt();

        }for (int j =num.length; j>0; j--) {
            System.out.println(j);
        }
    }


    }

