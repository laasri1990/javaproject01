package class8;

public class Task3 {
    public static void main(String[] args) {



        int[] nums = {10, 77, 25, 56, 60, 20,-10,-5};

         int smalest=nums[0];
        for (int i :nums) {

            if(i<smalest){

                smalest=i;
            }

        }
        System.out.println(smalest);
    }
}
