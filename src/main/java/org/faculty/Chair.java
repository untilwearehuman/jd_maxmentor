package org.faculty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public abstract class Chair implements Expell {

    private String faculty;
    private String chair;

    @Override
    public void expell() {
        System.out.println("You are expelled from the " + getFaculty() + ", " + getChair() + " Chair");
    }
}
