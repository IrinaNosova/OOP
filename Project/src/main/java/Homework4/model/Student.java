package Homework4.model;

import lombok.*;

@Getter

@EqualsAndHashCode(callSuper = true)


public class Student extends User implements Comparable<Student> {

    private Double gpa; //средний балл
    private String advisor; //руководитель


    public Student(Long id, String fullName, Integer age, String phoneNumber, String groupId) {
        super(id, fullName, age, phoneNumber, groupId);
    }


    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
