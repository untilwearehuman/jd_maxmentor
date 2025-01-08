package org.faculty;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Builder

public class Student {

    private String name;

    private String facultyName;

    private String chairName;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String chairName) {
        this.name = name;
        this.chairName = chairName;
    }
}
