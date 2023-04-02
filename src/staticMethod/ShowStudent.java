package staticMethod;

import java.util.Scanner;

public class ShowStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(111,"Hoang");
        Student student1 = new Student(222,"Khanh");
        Student student2 = new Student(333,"Nam");
        System.out.println("""
                Menu.
                1.Default Number.
                2.Number is not available.
                0.exit.
                """);
        System.out.println("Enter your selection:");
        int number = scanner.nextInt();
        switch (number){
            case 1 -> {
                System.out.println("Return result");
                student.display();
                student1.display();
                student2.display();
            }
            case 2 -> {
                System.out.println("-----Object 1-----");
                System.out.println("Enter rollno 1:");
                student.setRollno(scanner.nextInt());
                System.out.println("Enter name:");
                student.setName(scanner.next());
                System.out.println("-----Object 2-----");
                System.out.println("Enter rollno 2:");
                student1.setRollno(scanner.nextInt());
                System.out.println("Enter name:");
                student1.setName(scanner.next());
                System.out.println("-----Object 3-----");
                System.out.println("Enter rollno 3:");
                student2.setRollno(scanner.nextInt());
                System.out.println("Enter name:");
                student2.setName(scanner.next());
                student.display();
                student1.display();
                student2.display();
                System.out.println("-----End-----");
            }
            case 0 -> System.exit(0);
            default -> System.out.println("Number not exit:");
        }
    }
}
