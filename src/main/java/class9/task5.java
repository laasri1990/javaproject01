package class9;

public class task5 {

    public static void main(String[] args) {

       String[][] cars={ {"Ford", "Cadillac", "Jeep", "Tesla"},  // ptint all cars in 2 2d array ways
        {"BMW", "Audi", "Mercedes", "Volkwagen"},
        {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
        {"Ferrari", "Lamborghini", "Maserati", "Fiat"}};

        for(String[] r:cars){
            for(String x:r){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.print(cars[i][j]+" ");

            }
            System.out.println();

        }




    }
}


