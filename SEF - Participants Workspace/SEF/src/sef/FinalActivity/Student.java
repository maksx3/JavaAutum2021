package sef.FinalActivity;

public class Student extends Person {
    private String schoolName;

    public Student(String firstName, int age, String schoolName){
        super(firstName, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String introduce() {
        return String.format("I study in university %s", getSchoolName());
    }
}