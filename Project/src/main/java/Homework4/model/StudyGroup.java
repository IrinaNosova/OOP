package Homework4.model;

import Homework4.repository.TeacherRepository;
import Homework4.service.StudentGroupIterator;
import lombok.Data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Data
public class StudyGroup {

    private final String groupId;

    public StudyGroup(String groupId) {
        this.groupId = groupId;
    }
}
}
