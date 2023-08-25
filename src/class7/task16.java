package class7;

public class task16 {
    public static void main(String[] args) {

     /*
     2. Create an array of integer values. After the array is created, calculate
        the sum of all stored elements in that array.
      */

        int [] num={33,23,1,6,6,7,55,44,77,88};

        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum=sum+num[i];

        }
        System.out.println(sum);

    }
}
