package org.faculty;

public class Faculty2 extends Faculty{

    public Faculty2(String facultyName) {
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
