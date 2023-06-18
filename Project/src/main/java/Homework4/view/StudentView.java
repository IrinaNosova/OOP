package Homework4.view;

import Homework4.controllers.UserController;
import Homework4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    UserController<Student> controller;

    public StudentView(UserController<Student> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Student> students = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (students == null)  {
            System.out.println("students is null");
            return;
        }
        System.out.println("=====================");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("=====================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        controller.create(fullName, age, phoneNumber, groupId);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }
}
