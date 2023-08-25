package class5;

public class E5OrOperator {
    public static void main(String[] args) {

       boolean broughtFlowers=true;
       boolean broughtChocolate=false;
       boolean allMyMistake=false;
        if(broughtChocolate||broughtFlowers||allMyMistake){
            System.out.println("Wife is happy");
        }else{
            System.out.println("Wife is sad");
        }

    }
}
