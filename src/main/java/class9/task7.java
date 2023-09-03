package class9;

public class task7 {

    public static void main(String[] args) {

        int[][] numbers = {{34, 34, 23, 88}, {23, 43, 79, 20}, {463, 456, 234, 40}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);

                }


            }

        }


    }
}


