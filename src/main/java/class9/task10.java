package class9;

public class task10 {

    public static void main(String[] args) {
 /*
 **For you to do:**

Write a program to double the values of every element in the array and print it out.

**Example Output:**

```
2.8 4.0 6.6 4.0

8.0 3.0 12.2 2.0

2.4 6.2 8.0 3.2
  */

        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };

        //Double and print array
        for (int i = 0; i < a.length; i++) {
            for (int x = 0; x < a[i].length; x++) {
                System.out.print(a[i][x]*2+" ");
            }System.out.println();
        }





    }
}


