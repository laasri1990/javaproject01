package class9;

public class E92DArrays {

    public static void main(String[] args) {

        String[][]names={{"hind","mikhail","ismail","ahmed"},
                         {"jhon","bob","adam","tamim"},
                         {"joke","laugh","imad","mohammed"},
                         {"gui","backend","front","api"}};

      for(String[] row:names){
          for(String x:row){

              System.out.print(x+" ");
          }
          System.out.println();
      }
    }
}


