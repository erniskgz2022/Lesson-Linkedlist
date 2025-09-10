package practice_LinkedList.task2.models;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String firsName;
    private String email;
    private LocalDate yearOfBirth;
    private Double point;
    private String group;

    public Student() {
    }

    public Student(Long id, String firsName, String email, LocalDate yearOfBirth, Double point, String group) {
        this.id = id;
        this.firsName = firsName;
        this.email = email;
        this.yearOfBirth = yearOfBirth;
        this.point = point;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student" +
                "Id: " + id + "\n" +
                "Firs Name: " + firsName + '\n' +
                "Email: " + email + '\n' +
                "YearOfBirth: " + yearOfBirth + "\n" +
                "Point: " + point + "\n" +
                "Group: " + group + '\n';
    }
}
