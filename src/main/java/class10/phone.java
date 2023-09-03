package class10;

public class phone {

    String brand;

    int storage;
     int serial_number ;

     void calls(){
         System.out.println(" calling my mom .......");
     }
     void messages(){
         System.out.println("hey how are you .....");
     }

    public static void main(String[] args) {

         phone iphone= new phone();
         iphone.brand="Iphone12";
         iphone.storage=128;
         iphone.serial_number=186468948;

        System.out.println(iphone.brand);
        System.out.println(iphone.storage);
        System.out.println(iphone.serial_number);

        iphone.calls();
        iphone.messages();

        phone samsung=new phone();
        samsung.brand="samsungA50";
        samsung.storage=64;
        samsung.serial_number=9837663;

        System.out.println(samsung.brand);
        System.out.println(samsung.storage);
        System.out.println(samsung.serial_number);

        samsung.calls();
        samsung.messages();

    }


}
