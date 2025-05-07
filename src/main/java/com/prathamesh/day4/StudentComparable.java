package com.prathamesh.day4;

public class StudentComparable implements Comparable<Student>{
    int id;
    String name;

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }

    public static void main(String[] args) {
        Student student = new Student(2,"name2");
        StudentComparable studentComparable = new StudentComparable();
        System.out.println(studentComparable.compareTo(student));
    }
}
