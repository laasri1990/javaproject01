package class7;

public class task17 {
    public static void main(String[] args) {


        /*
        Write a java program to find the second largest number in the array?
         */

        int[] num={44,56,77,33,556,87,899,77,99,966,655,445,987};
        
        int largest =num[0];
        int secondlargest=num[0];

        for (int i = 0; i < num.length; i++) {
            
            if(num[i]>largest){
                secondlargest=largest;
                largest=num[i];

            }

        }
        System.out.println(secondlargest);



    }
}
