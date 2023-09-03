package codingproject1;

public class project2 {
    public static void main(String[] args) {


        /*
        Create a 2D array of integers. Develop a program which will calculate
        the sum of even and odd numbers for that array.
         */

        int[][] num={{23,44,35,75,65,42,},{44,3,22,3,44,55,6,},{22,88,84,26,12,66,90}};

        int sum=0;
        int sum2=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if(num[i][j]%2==0){
                    sum=sum+num[i][j];

                }  else if(num[i][j]%2!=0) {
                    sum2=sum2+num[i][j];


                }




            }
        }System.out.print("the sum of even value is "+sum);
        System.out.println();
        System.out.print("the sum of odd value is "+sum2);

    }
}
