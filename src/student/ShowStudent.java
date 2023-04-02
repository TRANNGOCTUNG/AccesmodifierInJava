package student;

import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("""
                Menu:
                1.Class.
                0.Exit.
                """);
        System.out.println("Choice your:");
        int number = scanner.nextInt();
        switch (number) {
            case 0 -> System.exit(0);
            case 1 -> {
                System.out.println("Enter Name: ");
                student.setName(scanner.next());
                System.out.println("Enter Class: ");
                student.setClassName(scanner.next());
                System.out.printf("%6s %10s\n","Name","ClassName");
                student.getDisplay();
            }
            default -> System.out.println("Not Exits:");
        }
    }
}
