package com.example.schooldatabase.repository;

import com.example.schooldatabase.entity.Address;
import com.example.schooldatabase.entity.Guardian;
import com.example.schooldatabase.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void shouldSaveStudent() {
        Guardian guardian = Guardian.builder()
                .email("bidhan@gmail.com")
                .contact("987654321")
                .name("bidhan debnath")
                .build();

        Address address = Address.builder()
                .city("new delhi")
                .houseNumber("c-2/104")
                .pincode("110085")
                .build();

        Student student = Student.builder()
                .firstName("Kanika")
                .lastName("Debnath")
                .emailId("kanishkdebu@gmail.com")
                .guardian(guardian)
                .address(address)
                .build();

        studentRepository.save(student);
    }

    @Test
    void shouldReturnAllStudents() {
        List<Student> students = studentRepository.findAll();
        System.out.println("students = " + students);
    }

    @Test
    void shoudReturnAllStudentsWithFirstNameStartsWith() {
        List<Student> students = studentRepository.findByFirstNameStartsWith("kan");
        System.out.println("students = " + students);
    }

    @Test
    void customAddressSearchTest() {
        List<Student> students = studentRepository.dhundoCitykeNaamSe("new delhi", "110085");
        System.out.println("students = " + students);
    }
}