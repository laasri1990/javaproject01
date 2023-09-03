package homework;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" what is the amount of loan is needed");
        int loan= scanner.nextInt();

        if(loan<=200000){
            System.out.println("lend the money ");
        }else{
            System.out.println("loan is rejected");
        }
    }
}
/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 */