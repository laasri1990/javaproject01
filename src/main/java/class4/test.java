package class4;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
       /* System.out.println("please enter month number");
        Scanner scanner=new Scanner(System.in);
        int Scanner=scanner.nextInt();
        int month=1;

        if (month==1){
            System.out.println("january");
        }else if (month==2){
            System.out.println("february");
        }else if (month==3){
            System.out.println("march");
        }else if (month==4){
            System.out.println("april");
        }else if (month==5){
            System.out.println("may");
        }else if (month==6){
            System.out.println("jun");
        }else if (month==7){
            System.out.println("july");
        }else if (month==8){
            System.out.println("august");
        }else if (month==9){
            System.out.println("september");
        }else if (month==10){
            System.out.println("october");
        }else if (month==11){
            System.out.println("november");
        }else if (month==12){
            System.out.println("december");
        }else{
            System.out.println("Invalid");
        }*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();

        if(age>=18){
            System.out.println("You are eligible to vote");
        }else if(age<18){
            System.out.println("You are not eligible to vote");
    }

      }
    }