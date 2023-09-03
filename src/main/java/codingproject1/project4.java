package codingproject1;

public class project4 {
    public static void main(String[] args) {


        /*
        Write a program to print out duplicate elements from an Array of
        Strings?
         */

        String[]name={"ahmed","youssef","mohamed","mustafa","khalid","ismail","abdellah","lahoucine","youssef","ismail",
                "abdellah"};

        for (int i = 0; i < name.length; i++) {
            for (int j = i+1; j < name.length; j++) {
                if(name[i].equalsIgnoreCase(name[j])){

                    System.out.println(name[j]);
                }

            }

        }



    }
}
