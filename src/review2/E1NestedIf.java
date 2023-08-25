package review2;

public class E1NestedIf {
    public static void main(String[] args) {

      String day="sunday" ;
      double accountBalance=5000;

      if(day.equals("sunday")){        // not equal with string we use (!day.equal("sunday")

          if(accountBalance>2000){     // we can not use == or any other athrematic with string
              System.out.println("we can buy this");
          }else{
              System.out.println("its too expensive");
          }
      }  else if(day.equals("saturday")){
          System.out.println("lets go for a dinner");
      }
      else{
          System.out.println("lets wit for sunday");
      }
    }
}
