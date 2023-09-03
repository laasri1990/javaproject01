package class16;

public class cat {
    private String name;
    private int age;
    private int weight;
    private String color;

    private char gender;

    public cat() {

    }

    public cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public cat(String name, int age, int weight, String color, char gender) {
        this(name, age, weight);
        this.color = color;
        this.gender = gender;
    }

    public void printInfo() {
        System.out.println(name + " " + age + " " + weight + " " + color + " " + gender);
    }

}
