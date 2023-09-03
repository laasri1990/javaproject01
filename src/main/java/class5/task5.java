package class5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scanner.nextLine();


        switch (country){
            case "saudi arab" :
                System.out.println("arabic");
                break;
            case "france":
                System.out.println("french");
                break;
            case "US":
                System.out.println("english");
                break;
            default:
                System.out.println("wrong country");
        }

    }
}
