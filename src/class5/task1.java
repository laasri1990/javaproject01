package class5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in); // M=upperCase         m=lowerCase
        System.out.println("Please enter your month birth day");
        String month=scanner.nextLine();
             // if(month.equalsIgnoreCase(anotherString"march")) it ignors different between capital and small capitals
        if(month.equals("march")||month.equals("april")||month.equals("may")){
            System.out.println("you were born in spring season ");
        }else if(month.equals("jun")||month.equals("july")||month.equals("august")){
            System.out.println("you were born in summer season ");
        }else{
            System.out.println("you were born in fall season");
        }

    }
}
