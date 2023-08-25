package class9;

public class E52DArrays {

    public static void main(String[] args) {

        int[][] numbers = {{109, 280, 330, 410}, {100, 200, 300, 432}, {123, 345, 567, 897}};

        int sum=0;

       for(int row=0;row<numbers.length;row++ ){  // add the sum of all numbers
           for( int col=0;col<numbers[row].length;col++){

               sum=sum+numbers[row][col];
           }
       }
        System.out.println(sum);

    }
}


