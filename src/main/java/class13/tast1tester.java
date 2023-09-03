package class13;

public class tast1tester {
    public static void main(String[] args) {

        SyntaxEmployee emp1=new SyntaxEmployee();

        emp1.empID="1233dlj";
        emp1.salary=20000;


        SyntaxEmployee emp2=new SyntaxEmployee();

         emp2.empID="6354hg";
         emp2.salary=30000;


        System.out.println(emp1.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(emp2.CEO);
        System.out.println(emp1.CEO);


    }
}
