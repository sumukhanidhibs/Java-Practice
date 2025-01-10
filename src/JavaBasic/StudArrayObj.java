package JavaBasic;

import java.util.Scanner;


class Student{
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}

public class StudArrayObj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter rollno: ");
            int rollno = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            System.out.println();

            students[i] = new Student(rollno, name, marks);
        }

        for(Student student : students){
//            System.out.println(student);
            System.out.println(student.rollno + " " + student.name + " " + student.marks);
        }

    }
}
