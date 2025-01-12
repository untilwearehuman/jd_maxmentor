package org.faculty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor

public abstract class Chair implements Expell {

    private String faculty;
    private String chair;
    @Setter
    private List<Student> studentList;

    public Chair(String faculty, String chair) {
        this.faculty = faculty;
        this.chair = chair;
    }

    @Override
    public void expell() {
        System.out.println("You are expelled from the " + getFaculty() + ", " + getChair() + " Chair");
    }
}
