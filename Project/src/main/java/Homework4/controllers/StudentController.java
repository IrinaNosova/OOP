package Homework4.controllers;

import Homework4.model.Student;
import Homework4.service.StudentService;

import java.util.List;

public class StudentController implements UserController<Student> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;

    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        studentService.create(fullName, age, phoneNumber, groupId);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();

    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }
}
