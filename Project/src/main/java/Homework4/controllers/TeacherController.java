package Homework4.controllers;

import Homework4.model.Teacher;
import Homework4.service.TeacherServise;
import lombok.Data;

import java.util.List;

public class TeacherController implements UserController<Teacher> {

    public final TeacherServise teacherServise;

    public TeacherController(TeacherServise teacherServise) {
        this.teacherServise = teacherServise;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupId) {
        teacherServise.create(fullName, age, phoneNumber, groupId);
    }

    @Override
    public List<Teacher> getAllSortUsers() {
        return teacherServise.getAllSortUsers();
    }

    @Override
    public List<Teacher> getAllSortUsersByFamilyName() {
        return teacherServise.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        teacherServise.removeUser(fullName);
        return true;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherServise.getAll();
    }

    @Override
    public List<Teacher> getAllSortUsersByAge() {
        return teacherServise.getAllSortUsersByAge();
    }
    public boolean editTeacher(Long id){
        teacherServise.editTeacher(id);
        return true;
    }
}
