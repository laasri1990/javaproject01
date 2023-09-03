package class3;

public class E9ElseIf {

    public static void main(String[] args) {

        String fruit="Apple";

        if(fruit.equals("mango")){ //fruit==mango
            System.out.println("price is 5$");

        }else if(fruit.equals("orange")){
            System.out.println(" price is 4$");

        }else if (fruit.equals("Apple")){
            System.out.println("price is 10$");

        } else if (fruit.equals("kiwi")) {
            System.out.println("price is 8$");

        }else{
            System.out.println("this fruit is not available right now");
        }
    }
}
