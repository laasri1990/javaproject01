package class5;

public class E8AndOperator {
    public static void main(String[] args) {

        boolean goodCredit=true;
        boolean stableAge=true;   // if one of those is false the out put will be else
        boolean minimAge=true;

        if(goodCredit && stableAge && minimAge){
            System.out.println("You can have the loan");
        }else{
            System.out.println(" you need fulfill the requirements ");
        }




    }
}
