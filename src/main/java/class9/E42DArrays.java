package class9;

public class E42DArrays {

    public static void main(String[] args) {

        int[][] numbers = {{109, 280, 330, 410}, {100, 200, 300, 432}, {123, 345, 567, 897}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col <numbers[row].length; col++) {// here we need to present variable of rows [row]
                System.out.print(numbers[row][col]+" ");        // numbers[row] gives us the complete 1d array
            }
            System.out.println();
        }

    }
}


