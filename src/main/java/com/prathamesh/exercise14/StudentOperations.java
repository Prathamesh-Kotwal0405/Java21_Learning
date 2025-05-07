package com.prathamesh.exercise14;

import java.util.ArrayList;
import java.util.List;

public class StudentOperations {



    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();
        Students student1 = new Students(1,"Student1","first","city1");
        Students student2 = new Students(2,"Student2","second","city2");
        StudentOperations op = new StudentOperations();
        op.addStudent(student1, studentsList);
        op.addStudent(student2, studentsList);
        studentsList.forEach(st -> System.out.println("Id: "+st.getStudentId() + ", Name: "+st.getStudentName() + ", Address: "+st.getStudentAddress()));
    }

    public void addStudent(Students students, List<Students> studentsList){
        studentsList.add(students);
        System.out.println("Student " + students.getStudentId() + " added");
    }


}
