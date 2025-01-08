package org.faculty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter


public abstract class Faculty {

    private String facultyName;

    public abstract void educate();

}
