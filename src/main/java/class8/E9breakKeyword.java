package class8;

import java.util.Scanner;

public class E9breakKeyword {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
         double total=0;

         while (true){ // because true the loop will always keep working

             System.out.println("please enter the price of the item or -1 to terminate");
             double price=scanner.nextDouble();

             if (price==-1){
                 break;
             }else{

                 total=total+price;
             }
             System.out.println("your total bill is "+total);
         }


    }
}
