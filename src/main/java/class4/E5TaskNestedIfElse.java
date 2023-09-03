package class4;

public class E5TaskNestedIfElse {
    public static void main(String[] args) {
        double rate=4.5;
        double price=50000;

        if(rate>4.5){
            System.out.println("user will not buy a house");
        }else{
            System.out.println("user will consider buying");
            if(price>50000){
                System.out.println("user will take a loan");
            }else{
                System.out.println("user will pay cash");
            }

        }
    }


}
