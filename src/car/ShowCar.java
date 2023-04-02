package car;

import java.util.Scanner;

public class ShowCar {
    public static void main(String[] args) {
        Car car = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        System.out.println(car.display());
        Car car1 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        System.out.println(car1.display());
    }
}
