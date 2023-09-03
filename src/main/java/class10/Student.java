package class10;

public class Student {

    // properties/attributes
    String name;
    int age;
    String id;
    // methods / functions / behaviours
    void study(){
        System.out.println("studying 16 hours a day ............");
    }

    public static void main(String[] args) {
         // we are creating ana actual student by using the student class
        Student youssef=new Student();
        youssef.name="youssef";
        youssef.age=33;
        youssef.id="ja117764";
        youssef.study(); // it works like scanner.nextInt()


        Student habib=new Student();
        habib.name="habib";
        habib.age=20;
        habib.id="hgt543";
        habib.study();


    }
}
