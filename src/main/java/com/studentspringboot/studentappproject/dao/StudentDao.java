package com.studentspringboot.studentappproject.dao;

import com.studentspringboot.studentappproject.entities.Student;

import java.util.List;

// Data Access Object interface for Student entity
public interface StudentDao {

    // Retrieve all students from the database
    List<Student> givingAllStudents();

    // Retrieve a single student by their ID
    Student getSingleStudent(Long id);

    // Add a new student to the database
    Student addSingleStudent(Student student);

    // Update an existing student in the database
    Student updateSingleStudent(Student newStudent);

    // Delete a single student by their ID
    void deleteSingleStudent(Long id);

    // Delete all students from the database
    void deletingAllStudents();
}
