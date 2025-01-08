package org.faculty;

public class Faculty3 extends Faculty{

    public Faculty3(String facultyName) {
        super(facultyName);
    }

    @Override
    public String getFacultyName() {
        return super.getFacultyName();
    }

    @Override
    public void setFacultyName(String facultyName) {
        super.setFacultyName(facultyName);
    }

    @Override
    public void educate() {
        System.out.println("gets the aducation at the " + getFacultyName());
    }
}
