package ComparisonDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age>o.age)
            return 1;
        else
            return -1;
    }
}



public class CompareStudents {

    public static void main(String[] args) {

        Comparator<Student> com = (n1, n2) -> n1.age>n2.age ? -1 : 1;

//        {
//           return n1.age>n2.age ? 1 :-1;
//        };
//        {
//            if(n1.age>n2.age)
//                return 1;
//            else
//                return -1;
//        };

        ArrayList<Student> list1 = new ArrayList<Student>();
        list1.add(new Student(19, "Jack"));
        list1.add(new Student(21, "farhan"));
        list1.add(new Student(22, "yeman"));
        list1.add(new Student(18, "XiZeng"));

        Collections.sort(list1);

        for(Student s : list1){
            System.out.println(s.toString()); 
        }


    }
}
