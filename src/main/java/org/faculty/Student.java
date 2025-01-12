package org.faculty;

import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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

    private String subject;

    private Map<String, List<Integer>> marksMap;

    public void addMark(String subject, int markValue) {
        if (marksMap.get(subject) == null) {
            List<Integer> marks = new ArrayList<>();
            marks.add(markValue);
            marksMap.put(subject, marks);
            return;
        }
        marksMap.get(subject).add(markValue);
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String chairName) {
        this.name = name;
        this.chairName = chairName;
    }
}
