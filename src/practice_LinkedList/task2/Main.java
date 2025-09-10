package practice_LinkedList.task2;

import practice_LinkedList.task2.models.Student;
import practice_LinkedList.task2.service.Impl.StudentServiceImpl;
import practice_LinkedList.task2.service.StudentService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();

        while (true){
            System.out.println("""
                    ~~~Student menu~~~
                    1 - Add Student
                    2 - SortByName
                    3 = SortByPoint
                    4 - SortByGroup
                    0 - Exit
                    """);
            int choic = sc.nextInt();
            sc.nextLine();

            switch (choic){
                case 1 ->{
                    System.out.print("ID: ");
                    Long sId = sc.nextLong();
                    sc.nextLine();
                    System.out.print("First Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Year: ");
                    String data = sc.nextLine();
                    LocalDate dt = LocalDate.parse(data);
                    System.out.print("Point: ");
                    Double point = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Group Name: ");
                    String group = sc.nextLine();
                    Student student = new Student(sId,name,email,dt,point,group);
                    studentService.addStudent(student);
                    System.out.println("Success add std");
                }
                case 2 -> {
                    System.out.print("Sort order (asc/desc): ");
                    String order = sc.nextLine();
                    studentService.sortByName(order);
                }
                case 3 -> {
                    System.out.print("Sort order (asc/desc): ");
                    String order = sc.nextLine();
                    studentService.sortByPoint(order);
                }
                case 4 -> {
                    System.out.print("Sort order (asc/desc): ");
                    String order = sc.nextLine();
                    studentService.sortByGroup(order);
                }
                case 0 -> {
                    System.out.println("Program finished!");
                    return;
                }
                default -> System.out.println("Wrong choice!");
            }
        }
    }
}
