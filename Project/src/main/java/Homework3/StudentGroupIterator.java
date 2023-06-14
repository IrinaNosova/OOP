package Homework3;

import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@Data
public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentList;
    private int count;


    @Override
    public boolean hasNext() {
        return count < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(count++);
    }

    @Override
    public void remove() {
        studentList.remove(--count);
    }

}
