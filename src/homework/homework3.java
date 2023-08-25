package homework;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your city ");
        String city=scanner.next();
        System.out.println("please enter temperature");
        double temperature=scanner.nextDouble();
         double celsius;

         celsius = (temperature-32)*5/9;
        System.out.println("The temperature in the city  is  "+celsius);

           /*Create a Java program that will ask user to input city and temperature.
            Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
            */


    }
}
