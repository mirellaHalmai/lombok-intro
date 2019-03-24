package com.codecool;

import com.codecool.model.Student;
import com.codecool.model.Teacher;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Haru", "haru@universe.com", LocalDate.of(1994, 7, 19));

        printBirthDateAndStudent(student);

        Student student2 = Student.builder()
                .name("Mai")
                .email("mai@universe.com")
                .birthDate(LocalDate.of(1997, 12, 31))
                .build();

        printBirthDateAndStudent(student2);

        Teacher kakuMichio = Teacher.builder()
                .name("Kaku Michio")
                .student(student)
                .student(student2)
                .build();

        System.out.println(kakuMichio);

        Teacher teacher = new Teacher();

        System.out.println(teacher);

    }

    private static void printBirthDateAndStudent(Student student) {
        System.out.println(student.getBirthDate());
        System.out.println(student);
        System.out.println("============");
    }
}
