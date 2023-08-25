package class7;

public class task14 {
    public static void main(String[] args) {

        int[] num = {5, 4, 8,12,88,5,46,32};
        int highest = num[0];

        for (int i = 0; i < num.length; i++) {
            if (num[i] > highest) {
                highest = num[i];
            }
        }System.out.println(highest);

        /*
        Write a program that prints the highest value in the array.
         */
    }


    }

