package class16;

public class task1 {

    private String name;
    private int age;
    private int weight;

    private char gender;
    private task1(String name,int age, int weight){// private is access at the same class only
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public task1(String name, int weight){// public is access anywhere in the project
        this.name=name;
        this.weight=weight;
    }
     task1(String name,int age,char gender ){ // default is access within the class and same package only
        this.name=name;
        this.age=age;


    }
    protected task1(int age, int weight){
        this.age=age;
        this.weight=weight;
    }


}
