package Homework3;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Data

public class StudentGroup implements Iterable<Student> {
    List<Student> studentList;

    public StudentGroup(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);
    }
}
