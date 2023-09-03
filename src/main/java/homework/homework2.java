package homework;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age");
        int age= scanner.nextInt();

        if(age>=18){
            System.out.println("driver license is issue");
        }else{
            System.out.println(" get a learners permit");
        }
    }
}
/*You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them,
 otherwise you will offer them to get a learners permit.
 */