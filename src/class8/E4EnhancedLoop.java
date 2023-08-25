package class8;

public class E4EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20}; // print how many numbers are largest than 20

        int count = 0;

        for (int y : nums) {

            if (y > 20) {
                count++;
            }

        }
        System.out.println(count);


    }
}
