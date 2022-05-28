package Week11;

import java.util.*;
import java.util.Collections;

public class Test {
    public Test() {
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        Student s3 = new Student(3, "C");
        Student s4 = new Student(4, "D");
        Student s5 = new Student(5, "E");
        Student s6 = new Student(6, "F");
        Student s7 = new Student(7, "G");
        Student s8 = new Student(8, "H");
        Student s9 = new Student(9, "I");

        ArrayList<Student> a1 = new ArrayList<Student>();
        ArrayList<Student> a2 = new ArrayList<Student>();
        ArrayList<Student> a3 = new ArrayList<Student>();

        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a2.add(s4);
        a2.add(s5);
        a3.add(s6);
        a3.add(s7);
        a3.add(s8);
        a3.add(s9);

        Course c1 = new Course(1, "A", a1);
        Course c2 = new Course(2, "B", a2);
        Course c3 = new Course(3, "C", a3);

        Course c4 = (Course) c1.clone();

        Course[] courses = new Course[3];
        courses[0] = c1;
        courses[1] = c2;
        courses[2] = c3;

        Arrays.sort(courses);

        for (Course course : courses) {
            System.out.println(course.getName());
        }
    }
}
