package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your name");
        String name=scanner.next();
        if(name.equals("youssef")){
            System.out.println("i live in shreveport");
        }else if(name.equals("abdo")){
            System.out.println("you are my friend");
        }else if(name.equals("ismail")){
            System.out.println("you are my brother");
        }else if (name.equals("lahoucine")){
            System.out.println("you are my younger brother");*/

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if(num>0){
            System.out.println(num+" is positive");
        }else{
            System.out.println(num+" is negative");
        }if(num==0){
            System.out.println("Entered number is equals to 0");
        }
    }
}
