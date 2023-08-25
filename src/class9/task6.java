package class9;

public class task6 {

    public static void main(String[] args) {

     int[][] numbers={{34,34,23,},{23,43,79},{463,456,234} };

     int sum = 0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                sum=sum+numbers[i][j];
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();


        }System.out.println("sum is "+sum);







    }
}


