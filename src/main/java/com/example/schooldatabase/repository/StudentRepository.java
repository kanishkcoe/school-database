package com.example.schooldatabase.repository;

import com.example.schooldatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long>{
    List<Student> findAll();
    Student save(Student student);
    Optional<Student> findById(Long id);

    List<Student> findByFirstNameStartsWith(String prefix);

    @Query(value = "SELECT student FROM Student student WHERE student.address.city = ?1 AND student.address.pincode = ?2")
    List<Student> dhundoCitykeNaamSe(String city, String pincode);
}
