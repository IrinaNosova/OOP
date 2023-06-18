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

        view.create("Иванов Иван Иванович", 28, "89511111757", "5");
        view.create("Сидоров Сидор Сидорович", 59, "899525879", "5");
        view.create("Леонидов Леонид Леонидович", 37, "89514567892", "2");
        view.sendOnConsole(SortType.NONE);

        StudentsRepository studentsRepository = new StudentsRepository();
        StudentService studentService = new StudentService(studentsRepository);
        StudentController studentController = new StudentController(studentService);
        StudentView studentView = new StudentView(studentController);

        studentView.create("Федоров Федор Федорович", 39, "89984456555", "2");
        studentView.create("Петров Петр Петрович", 18, "89564444425", "5");
        studentView.create("Сергеев Сергей Сергеевич", 26, "89756231444","5");
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
