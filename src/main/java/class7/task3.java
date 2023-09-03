package class7;

public class task3 {
    public static void main(String[] args) {


        int i = 1;
        while (i < 5) {
            int j = 1;
            while (j < 7) {
                if (j != 3) {
                    System.out.print(j + " ");
                }
                j++;
            }
            System.out.println();

            i++;
        }
    }
}
