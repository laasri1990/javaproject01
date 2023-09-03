package class10;

public class DogTester {

    public static void main(String[] args) {
        dog luna=new dog(); // we are creating obj from dog class
        //assigning a value luna name,gender....
        luna.name="luna";
        luna.gender='F';
        luna.breed="shiba";
        luna.weight=10;
        luna.age=25;
        System.out.println(luna.name);
        System.out.println(luna.gender);
        System.out.println(luna.breed);
         // calling the methods on luna
        luna.bark();
        luna.eat();
        luna.sleep();


    }
}
