package class4;

public class E4TaskNestedIfElse {
    public static void main(String[] args) {

        boolean hasDegree=true;
         double gpa=3.5;


        if(hasDegree==true){
            System.out.println("congratulation");
            if(gpa>=3.5){
                System.out.println("you are eligible for scholarship ");

            }else{
                System.out.println("you should have studied harder");
            }

        }else {
            System.out.println("you should get a degree");
        }
    }
}
