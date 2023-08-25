package class8;

public class Task1 {
    public static void main(String[] args) {

// count how many true values are present in array
        boolean [] conds={true,false,true,false,true,true};
        int count=0;

        for (int i = 0; i < conds.length ; i++) {

            if(conds[i]){ // condition it true
                count++;

            }

        }
        System.out.println(count);


    }
}
