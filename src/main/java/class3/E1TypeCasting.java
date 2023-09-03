package class3;

public class E1TypeCasting {

    public static void main(String[] args) {

        long age=12;
       // int myAge=age; // error because long is bigger than int
        byte number=10;
        int number2=number; // it can work because byte is smaller than int ( this is what is casting)
        System.out.println(number);

        float nume1=15.6f;
        int nume2;
        nume2=(int)nume1; //in this way it can be printed but we are going to lose data (.6)
        System.out.println(nume2);






    }
}
