package Homework3;

import lombok.Data;

@Data

public class controller {
    private final StudentGroupService groupService;

    public controller(StudentGroupService groupService) {
        this.groupService = groupService;
    }

    public boolean deleteStudent(String fullName){
        groupService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student){
        groupService.addStudent(student);
    }

    public void printAll(){
        groupService.printAll();
    }

    public void compareTo(){
        groupService.compareTo();
    }

    public void sortBySecondName(){
        groupService.sortBySecondName();
    }

    public void sortByid(){
        groupService.sortByid();
    }
}
