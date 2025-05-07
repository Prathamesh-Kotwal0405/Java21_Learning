package com.prathamesh.day4;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int count=0;
        if(o1.id== o2.id){
            count+=1;
        }if(o1.name==o2.name){
            count+=1;
        }
        return count;
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }

    public static void main(String[] args) {
        Student o1 = new Student(1,"Student1");
        Student o2 = new Student(1,"Student2");
        StudentComparator studentComparator = new StudentComparator();
        System.out.println(studentComparator.compare(o1,o2));
    }
}
