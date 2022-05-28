package Week11;

import java.util.*;

public class Course implements Cloneable, Comparable<Course> {
    private int id;
    private String name;
    List<Student> students;

    public String getName() {
        return this.name;
    }

    public Course(int id, String name, List<Student> students) {
        this.id = id;
        this.name = name;
        this.students = students;
    }
    public void setName( String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }
//    public Object clone() {
//        try {
//            Course t = (Course)super.clone();
//            t.students = (ArrayList)this.students.clone();
//            return t;
//        } catch (CloneNotSupportedException var2) {
//            return null;
//        }
//    }

    public int compareTo(Course course){
        if(this.students.size() > course.students.size()){
            return 1;
        }else if(this.students.size() < course.students.size()){
            return -1;
        }else{
            return 0;
        }
    }

//    @Override
//    public int compareTo(Course compareThing) {
//        if (this.students.size() > compareThing.students.size()) {
//            return 1;
//        } else {
//            return this.students.size() < compareThing.students.size() ? -1 : 0;
//        }
//    }
}
