package Homework4.service;

import Homework4.model.User;
import Homework4.repository.StudentsRepository;
import Homework4.model.Student;
import lombok.Data;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@Data
public class StudentService implements UserService<Student> {

    private final StudentsRepository studentRepository;



    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        Long id =studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber, groupId);
        studentRepository.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);
        return students;
    }
    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparatorBySecondName<>());
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparatorByAge<>());
        return students;
    }

    @Override
    public void removeUser(String fullName) {
        studentRepository.remove(fullName);
    }
}
