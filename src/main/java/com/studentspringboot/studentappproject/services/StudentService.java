package com.studentspringboot.studentappproject.services;

import com.studentspringboot.studentappproject.entities.Student;

import java.util.List;

// Service interface for Student entity
public interface StudentService {

    // Retrieve all students
    List<Student> getAllStudents();

    // Retrieve a single student by their ID
    Student getSingleStudent(Long id);

    // Add a new student
    Student addStudent(Student student);

    // Update an existing student
    Student updateStudent(Student newStudent);

    // Delete a single student by their ID
    void deleteStudent(Long id);

    // Delete all students
    void deleteAll();
}
