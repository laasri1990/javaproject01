package class7;

public class E10Arrays {
    public static void main(String[] args) {

        String[] fruit = {"Apple", "Orange", "Banana", "Kiwi", "PineApple"};

        fruit[3]="Mango"; // replace the value of kiwi to mango
        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);

        }
    }
}
