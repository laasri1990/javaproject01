package review4;

public class E5Arrays {

    public static void main(String[] args) {

       int [] salaries={120000,150000,200000};
        System.out.println(salaries[2]);
        salaries[1]=160000; // updating the value
        System.out.println(salaries[1]);
        //salaries[3]=400000; error outOfbond
        //System.out.println(salaries[3]);
    }
}
