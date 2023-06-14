package Homework3;

import lombok.Data;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Data

public class StudentGroupService {
    private final StudentsRepository repository;

    public void addStudent(Student student) {
        repository.addStudent(student);
    }

    public void printAll() {
        for (Student student : repository.getStudentGroup()) {
            System.out.println(student);

        }
    }


    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = repository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

    public void compareTo(){
        repository.getStudentGroup().getStudentList().sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });


    }

    public void sortBySecondName(){
        repository.getStudentGroup().getStudentList().sort(new StudentComparator());
    }

    public void sortByid(){
        repository.getStudentGroup().getStudentList().sort(new StudentComparatorByid());
    }
}
