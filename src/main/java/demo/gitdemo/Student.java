package demo.gitdemo;

public class Student {
    int id;
    String studentCode;

    public Student(int id, String studentCode) {
        this.id = id;
        this.studentCode = studentCode;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
