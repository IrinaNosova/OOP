package Homework3;

public class main {
    public static void main(String[] args) {

        StudentGroup group = new StudentGroup();
        StudentsRepository repository = new StudentsRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        controller controller = new controller(service);

        controller.addStudent(new Student("Иван Иванов", 2L));
        controller.addStudent(new Student("Петр Петров ",1L ));
        controller.addStudent(new Student("Александр Александров",1L ));
        controller.addStudent(new Student("Виктор Викторов",6L ));
        controller.addStudent(new Student("Леонид Леонидов",9L ));
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.deleteStudent("Anna Morozova");
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.compareTo();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortBySecondName();
        controller.printAll();
        System.out.println("-".repeat(50));
        controller.sortByid();
        controller.printAll();

    }
}
