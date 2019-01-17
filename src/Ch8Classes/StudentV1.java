package Ch8Classes;

public class StudentV1 {
    private String name;
    private int grade;
    private String school;
    private int studentID;
    private double gpa;
    private int dob;
    private String[] schedule;
    private String address;
    private String counselor;
    private char gender;
    private int attendance;

    //overloaded copnstructur below
    public StudentV1(String name, int dob, char gender, String address, int grade){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
    }

    public StudentV1(String name, int dob, char gender, String address, int grade, double gpa){
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public int getDob() {
        return dob;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public char getGender() {
        return gender;
    }

    public int getAttendance() {
        return attendance;
    }
}
