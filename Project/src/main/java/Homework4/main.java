package Homework4;

import Homework4.controllers.StudentController;
import Homework4.controllers.StudyGroupController;
import Homework4.controllers.TeacherController;
import Homework4.model.Student;
import Homework4.model.StudyGroup;
import Homework4.model.Teacher;
import Homework4.repository.StudentsRepository;
import Homework4.repository.TeacherRepository;
import Homework4.service.StudentService;
import Homework4.service.StudyGroupService;
import Homework4.service.TeacherServise;


public class Main {
    public static void main(String[] args) {


        TeacherRepository repository = new TeacherRepository();
        TeacherServise service = new TeacherServise(repository);
        TeacherController controller = new TeacherController(service);
        TeacherView view = new TeacherView(controller);

        view.create("Andrei Andrei", 55, "02", "5");
        view.create("Elena Elena", 45, "03", "5");
        view.create("Maria Maria", 20, "112", "2");
        view.sendOnConsole(SortType.NONE);

        StudentsRepository studentsRepository = new StudentsRepository();
        StudentService studentService = new StudentService(studentsRepository);
        StudentController studentController = new StudentController(studentService);
        StudentView studentView = new StudentView(studentController);

        studentView.create("Ivan Morozov", 18, "02", "2");
        studentView.create("Petr Vorobev", 19, "03", "5");
        studentView.create("Sidor Sidorov", 20, "112","5");
        studentView.sendOnConsole(SortType.NONE);

        StudyGroup group = new StudyGroup("5");
        StudyGroupService groupService = new StudyGroupService(group, studentsRepository, repository);
        StudyGroupController groupController = new StudyGroupController(groupService);
        StudentGroupView groupView = new StudentGroupView(groupController);

        groupView.addUsers(studentsRepository, repository);
        groupView.sendOnConsole(SortType.NONE);
        groupView.sendOnConsole(SortType.STUDENT);
        groupView.sendOnConsole(SortType.TEASHER);


    }

}
