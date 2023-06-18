package Homework4.view;

import Homework4.model.User;

public interface UserView<T extends User> {

    void sendOnConsole(String sortType);
    void create(String fullName, Integer age, String phoneNumber, String groupId);
    void removeUser(String fullName);

}
