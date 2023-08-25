package class10;

public class E8StringDemo {

    public static void main(String[] args) {

        String name="Today is a java Class";
        System.out.println(name.startsWith("T"));//true
        System.out.println(name.startsWith("t"));//false
        System.out.println(name.startsWith(" Today"));//false

        System.out.println(name.endsWith("s"));//true
        System.out.println(name.endsWith("S"));//false
        System.out.println(name.endsWith("Class"));//true







    }
}
