package class9;

public class task16 {

    public static void main(String[] args) {


        /*
        Maximum and minimum number in the array?
         */

        int[] num={22,33,66,18,91,23,45,55,76,345,78,99,666,456};

        int min = num[0];
        int max = num[0];
        for (int i = 0; i < num.length; i++) {

            if(num[i]>max){
                max=num[i];
            } else if (num[i]<min) {
                min=num[i];
            }

        }
        System.out.print("the maximum number is :  "+max);
        System.out.println();
        System.out.println("the minimum number is : "+min);

    }
}


