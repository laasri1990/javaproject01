package class15;

public class task1 {

    private int age;
    public task1(int getage){
        age=getage;
        System.out.println("your age is "+getage);
    }

    public task1(){
        System.out.println("no data");
    }

    public static void main(String[] args) {

        task1 ob1=new task1();
        task1 ob2=new task1(12);

    }
}
