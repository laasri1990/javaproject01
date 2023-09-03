package class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20}; // pick the largest number

        int largest=nums[0];
        for(int n:nums){

            if(n>largest){

                largest=n;
            }

        }
        System.out.println(largest);


    }
}
