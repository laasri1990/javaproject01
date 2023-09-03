package class9;

public class E22DArrays {

    public static void main(String[] args) {

        String[][]names={{"hind","mikhail","ismail","ahmed"},
                         {"jhon","bob","adam","tamim"},
                         {"joke","laugh","imad","mohammed"},
                         {"gui","backend","front","api"}};

        String[] row = names[2];
       // System.out.println(row[3]);
      //  System.out.println(Arrays.toString(row));

        for(String name:row){ // name is just a variable we can change it
            System.out.println(name);
        }

    }
}


