package org.faculty;

public class Chair1 extends Chair {


    public Chair1(String faculty, String chair) {
        super(faculty, chair);
    }

    @Override
    public String getFaculty() {
        return super.getFaculty();
    }

    @Override
    public void setFaculty(String faculty) {
        super.setFaculty(faculty);
    }

    @Override
    public String getChair() {
        return super.getChair();
    }

    @Override
    public void setChair(String chair) {
        super.setChair(chair);
    }

    @Override
    public void expell() {
        super.expell();
    }
}
