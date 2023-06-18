package Homework4.service;

import Homework4.model.Student;
import Homework4.model.StudyGroup;
import Homework4.model.Teacher;
import Homework4.model.User;
import Homework4.repository.StudentsRepository;
import Homework4.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    private StudentsRepository students;

    private TeacherRepository teachers;

    private StudyGroup group;

    List<User> StudyList;


    public StudyGroupService(StudyGroup group, StudentsRepository students, TeacherRepository teachers) {
        this.students = students;
        this.teachers = teachers;
        this.group = group;
        StudyList = new ArrayList<>();
    }

    public void addUsers(StudentsRepository students, TeacherRepository teachers){
        for (Student student : students.getAll()) {
            if (student.getGroupId().equals(group.getGroupId())){
                StudyList.add(student);
            }

        }
        for (Teacher teacher: teachers.getAll()) {
            if (teacher.getGroupId().equals(group.getGroupId())){
                StudyList.add(teacher);
                break;
            }

        }

    }
    public List<User> getAll(){
        return StudyList;
    }
}
