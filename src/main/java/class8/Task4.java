package class8;

public class Task4 {
    public static void main(String[] args) {

         // go throw the array and replace all negative numbers to 0

        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < 0) {

                nums[i] = 0;
            }
            System.out.println(nums[i]);

        }
    }
}
