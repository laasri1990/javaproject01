package class9;

public class task4 {

    public static void main(String[] args) {

        String [][] student={{"ausha","guilia","jhon","deepali"},{"A","A+","C","B"}};


        for (int i = 0; i < student[0].length; i++) { // it looks like i<4
            if(student[1][i].equals("A") || student[1][i].equals("B"))
            System.out.println(student[0][i]);

        }

    }
}


