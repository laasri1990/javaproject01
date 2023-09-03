package class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20}; // print all even numbers


        for (int n : nums) {

            if (n % 2 == 0) {

                System.out.println(n);
            }


        }


    }
}
