package org.faculty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) {

        Student student11 = Student.builder()
                .name("Max")
                .facultyName("Faculty of Mathematics")
                .chairName("Programming Technology")
                .build();
        System.out.println(student11);
        Faculty1 faculty1 = new Faculty1(student11.getFacultyName());
        faculty1.educate();
        Chair1 chair1 = new Chair1(faculty1.getFacultyName(), student11.getChairName());
        chair1.expell();

        Student student12 = Student.builder()
                .name("Blablabla")
                .facultyName("Faculty of Magic")
                .chairName("Programming Technology")
                .build();
        System.out.println(student12);
        Faculty1 faculty12 = new Faculty1(student12.getFacultyName());
        faculty1.educate();
        Chair1 chair12 = new Chair1(faculty1.getFacultyName(), student12.getChairName());
        chair1.expell();

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(student11);
        studentList1.add(student12);
        chair1.setStudentList(studentList1);

        for(Student student : studentList1) {
            System.out.println(student);
        }

      /*  System.out.println();

        Student student2 = Student.builder()
                .name("Alex")
                .facultyName("Faculty of Mechanics")
                .chairName("Metal Cutting")
                .build();
        System.out.println(student2);
        Faculty2 faculty2 = new Faculty2(student2.getFacultyName());
        faculty2.educate();
        Chair2 chair2 = new Chair2(faculty2.getFacultyName(), student2.getChairName());
        chair2.expell();

        System.out.println();

        Student student3 = Student.builder()
                .name("Gena")
                .facultyName("Faculty of History")
                .chairName("History of Belarus")
                .build();
        System.out.println(student3);
        Faculty3 faculty3 = new Faculty3(student3.getFacultyName());
        faculty3.educate();
        Chair3 chair3 = new Chair3(faculty3.getFacultyName(), student3.getChairName());
        chair3.expell();*/



//        List<Student> chair1List = new ArrayList<>();
//        chair1List.add(new Student("Ivan", chair1.getChair()));
//        chair1List.add(new Student("Petr", chair1.getChair()));

//        student11.addMark("Mathematics", 10);
//        student2.addMark("History of Belarus", 9);
//        student3.addMark("Philosophy", 8);
//        chair1List.get(1).addMark("Mathematics", 7);
//        chair1List.get(1).addMark("History of Belarus", 7);
//        chair1List.get(1).addMark("Philosophy", 7);

//        System.out.println(student11);
//        System.out.println(student2);
//        System.out.println(student3);


//        for (Student l : chair1List) {
//            System.out.println(l);
//        }

//        chair1List.get(0).setFacultyName("Faculty of Odd Numbers");
//        chair1List.get(1).setFacultyName("Faculty of Logic");
//        for (Student l : chair1List) {
//            System.out.println(l);
//        }

    }
}
