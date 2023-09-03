package class7;

public class task10 {
    public static void main(String[] args) {


 int[]number= {20,29,48,69,60}; // print even numbers

        for (int i = 0; i < number.length; i++) {
            if (number[i]%2==0) { // !==0 for even numbers

                System.out.println(number[i]);
            }
        }

    }
}
