package class9;

public class task14 {

    public static void main(String[] args) {

    /*
    Create a 2D array or integer type where you will store odd and even
    numbers. Develop a program which will identify/print the even
    numbers only.
     */

        int[][] num={{12,34,44,6,88,3},{2,3,7,99,22,12,65},{22,44,77,66,43,22}};


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if(num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }


            }
        }

    }
}


