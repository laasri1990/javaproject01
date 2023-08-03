package class3;

public class E2TypeCasting {

    public static void main(String[] args) {

       float box1=15.0f; // even in this situation we are getting error because float is different types
       int box2;
       box2=(int)box1;// type casting narrowing/explicit/manual
        System.out.println(box2);

        int number=128; //we are going out put that isn't make since so it something totally wrong
        byte number2;
        number2=(byte)number;
        System.out.println(number2);

        short box3=2000;
        int box4=box3;  // type casting is .implicit/auto . in this case is write because short is smaller than int
        System.out.println(box4);










    }
}
