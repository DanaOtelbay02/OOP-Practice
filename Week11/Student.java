package Week11;

public class Student {
    private int id;
    private String name;

    public Student() {
        this.id = 0;
        this.name = "Namecds";
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Student name is: " + this.name + "id is: " + this.id;
    }
}
