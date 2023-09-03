package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        System.out.println("please enter your age");
        //creating the object of the scanner class so that we can reuse the logic from
        //this class which is already written for us by java developers
        Scanner scanner=new Scanner(System.in);
        //take an input from the user and storing it in int
       String name= scanner.next();
       if(name.equals("youssef")){
           System.out.println("java student");
       }else{
           System.out.println("i don't know you");
       }
      //  System.out.println("hello "+name);
    }
}
