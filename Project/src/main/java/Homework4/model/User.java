package Homework4.model;

import lombok.*;

@Data
public class User {
    private Long id;
    private String fullName;
    private Integer age;
    private String phoneNumber;
    private String groupId;

    public User(Long id, String fullName, Integer age, String phoneNumber, String groupId) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.groupId = groupId;
    }

}
