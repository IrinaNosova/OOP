package Homework4.service;

import Homework4.model.Student;
import Homework4.model.User;

import java.util.Comparator;


public class UserComparatorBySecondName<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getFullName().split("\\s+")[1].compareTo(o2.getFullName().split("\\s+")[1]);
    }
}
