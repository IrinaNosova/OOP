package Homework4.view;

import Homework4.controllers.StudyGroupController;
import Homework4.model.Student;
import Homework4.model.User;
import Homework4.repository.StudentsRepository;
import Homework4.repository.TeacherRepository;

import java.util.List;

public class StudentGroupView {
    private final StudyGroupController groupController;

    public StudentGroupView(StudyGroupController groupController) {
        this.groupController = groupController;

    }
    public void sendOnConsole(String sortType) {
        List<User> groupList = switch (sortType) {
            case SortType.NONE -> groupController.getAll();
            case SortType.STUDENT -> groupController.getStudent();
            case SortType.TEASHER -> groupController.getTeacher();
            default -> null;
        };
        if (groupList == null)  {
            System.out.println("group is null");
            return;
        }
        System.out.println("=====================");
        for (User user : groupList) {
            System.out.println(user);
        }
        System.out.println("=====================");
    }
    public void addUsers(StudentsRepository students, TeacherRepository teachers){
        groupController.addUsers(students, teachers);
    }
}
