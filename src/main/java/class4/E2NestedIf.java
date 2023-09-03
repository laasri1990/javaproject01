package class4;

public class E2NestedIf {
    public static void main(String[] args) {

        boolean winter=true;
        String jacketColor="blue";

        if(winter==true){
                System.out.println("its very cold");
            if(jacketColor.equals("red")){
                System.out.println("lets go with red nike shoes");
            }else{
                System.out.println("lets go with the blue ones");

            }
        }else{
            System.out.println("no need to wear jackets");
        }
    }
}
