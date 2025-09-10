package practice_LinkedList.task2.service.Impl;

import practice_LinkedList.task2.db.sDatabase;
import practice_LinkedList.task2.models.Student;
import practice_LinkedList.task2.service.StudentService;

import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public void sortByName(String asOrDesc) {
        if (asOrDesc.equalsIgnoreCase("asc")){
            sDatabase.students.sort(Comparator.comparing(Student::getFirsName));
        }else {
            sDatabase.students.sort(Comparator.comparing(Student::getFirsName).reversed());
        }
        sDatabase.students.forEach(System.out::println);

    }

    @Override
    public void  sortByPoint(String asOrDesc) {
        if (asOrDesc.equalsIgnoreCase("asc")){
            sDatabase.students.sort(Comparator.comparing(Student::getPoint));

        }else if (asOrDesc.equalsIgnoreCase("desc")){
            sDatabase.students.sort(Comparator.comparing(Student::getPoint).reversed());
        }
        sDatabase.students.forEach(System.out::println);

    }

    @Override
    public void sortByGroup(String asOrDesc) {
        if (asOrDesc.equalsIgnoreCase("asc")){
            sDatabase.students.sort(Comparator.comparing(Student::getGroup));

        }else if (asOrDesc.equalsIgnoreCase("desc")){
            sDatabase.students.sort(Comparator.comparing(Student::getGroup).reversed());
        }
        sDatabase.students.forEach(System.out::println);

    }

    @Override
    public void addStudent(Student newStudent) {
        sDatabase.students.add(newStudent);
        System.out.println("Student added: " + newStudent);
    }


}
