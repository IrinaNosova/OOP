package Homework3;
import lombok.Data;

@Data

public class StudentsRepository {
    private final StudentGroup studentGroup;

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }

}
