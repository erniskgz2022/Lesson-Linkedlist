package practice_LinkedList.task2.service;

import practice_LinkedList.task2.models.Student;

import javax.swing.*;
import java.util.List;

public interface StudentService {
    void sortByName(String asOrDesc);
    void sortByPoint(String asOrDesc);
    void sortByGroup(String asOrDesc);
    void addStudent(Student newStudent);
}