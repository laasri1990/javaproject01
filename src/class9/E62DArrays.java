package class9;

public class E62DArrays {

    public static void main(String[] args) {

        int[][] numbers = {{109, 280, 330, 410}, {100, 200, 300, 432}, {123, 345, 567, 897}};

        for (int i = 0; i <3 ; i++) {
            System.out.println(numbers[i][1]); // printing the column not row it depence about the first [] every time
                                                // it means always row exp [i][]1] or [1][i]
        }

    }
}


