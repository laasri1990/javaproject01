package class7;

public class E12Arrays {
    public static void main(String[] args) {

     int [] prices=new int[5];

     prices[0]=1000;
     prices[2]=250;
     prices[2]=234; // we reniew the value of 2

        System.out.println(prices[4]); //  we gonna get 0 because we dont give it a value as [0] and it should
                                        // be between 0 to 4 or we will get an error
    }
}
