package circle;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShowCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        System.out.println("""
                Menu:
                1.Circle 1:
                2.Circle 2:
                0.Exit:
                """);
        System.out.println("Your choice:");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                System.out.println("---------------Circle 1-----------------");
                System.out.println("Radius 1:");
                circle.setRadius(scanner.nextInt());
                System.out.println("Color 1: ");
                circle.setColor(scanner.next());
                circle.display();
                System.out.println("--------End--------");
            }
            case 2 -> {
                System.out.println("---------------Circle 2-----------------");
                System.out.println("Radius 2:");
                circle1.setRadius(scanner.nextInt());
                System.out.println("Color 2: ");
                circle1.setColor(scanner.next());
                circle1.display();
                System.out.println("--------End--------");
            }
            default -> System.out.println("Not Circle Thank You:");
        }
    }
}
