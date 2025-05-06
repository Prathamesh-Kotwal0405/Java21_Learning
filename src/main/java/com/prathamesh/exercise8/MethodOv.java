package com.prathamesh.exercise8;

public class MethodOv {
    public int rollNo;
    public String name;
    public int marks;
    public String classNo;

    public void print(int rollNo){
        System.out.println("Roll No. of Student is : "+ rollNo);
    }

    public void print(int rollNo,int marks){
        System.out.println("Roll No. of Student is : "+ rollNo + "\nMarks obtained : "+marks);
    }

    public void print(int rollNo,String name, int marks ){
        System.out.println("Roll No. : "+ rollNo + "\nName : "+name + "\nMarks obtained : "+marks);
    }

    public static void main(String[] args) {
        MethodOv mo = new MethodOv();
        System.out.println("First function");
        mo.print(1);
        System.out.println("Second function");
        mo.print(1,90);
        System.out.println("Third function");
        mo.print(1,"Prathamesh",84);
    }
}
