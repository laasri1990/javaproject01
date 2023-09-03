package class7;

public class task15 {
    public static void main(String[] args) {

        /*
        1. Create a program that uses an array to store a list of temperatures for
        a week, and then uses a loop to find the highest and lowest
        temperature for the week.
         */


        int[] temperature = {23, 45, 76, 12, 45, 76, 59};

        int max = temperature[0];
        int min = temperature[0];

        for (int i = 0; i < temperature.length; i++) {

            if (temperature[i] > max) {
                max = temperature[i];

            } else if (temperature[i] < min) {
                min = temperature[i];
            }


        }
        System.out.println("the lowest temperature at the week is :  "+min);
        System.out.println("the highest temperature at the week is :  "+max);


    }
}
