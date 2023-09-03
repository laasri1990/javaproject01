package class10;

public class task1 {
    String color;
    int year;
    String make;
    public static void main(String[] args) {

        task1 car=new task1();

        car.color="Black";
        car.year=2019;
        car.make="BMW";

        System.out.println("Car color is "+car.color+" and car year is "+car.year+" and car model is "+car.make);

        car.color="White";
        car.year=2018;
        car.make="Toyota";

        System.out.println("Car color is "+car.color+" and car year is "+car.year+" and car model is "+car.make);

    }

}
