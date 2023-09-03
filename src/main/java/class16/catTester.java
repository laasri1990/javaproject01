package class16;

public class catTester {
    public static void main(String[] args) {

        cat c1=new cat("jack",10,20);
        c1.printInfo();
        cat c2=new cat("jacku",20,25,"brown",'M');
        c2.printInfo();
        cat c3=new cat();
        c3.printInfo();
    }
}
