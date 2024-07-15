package com.studentspringboot.studentappproject.services;

import com.studentspringboot.studentappproject.dao.StudentDao;
import com.studentspringboot.studentappproject.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    // Injecting the StudentDao to interact with the persistence layer
    @Autowired
    private StudentDao studentdao;

    // Retrieve all students
    @Override
    public List<Student> getAllStudents() {
        return this.studentdao.givingAllStudents();
    }

    // Retrieve a single student by their ID
    @Override
    public Student getSingleStudent(Long id) {
        return this.studentdao.getSingleStudent(id);
    }

    // Add a new student
    @Override
    public Student addStudent(Student student) {
        return this.studentdao.addSingleStudent(student);
    }

    // Update an existing student
    @Override
    public Student updateStudent(Student newStudent) {
        return this.studentdao.updateSingleStudent(newStudent);
    }

    // Delete a single student by their ID
    @Override
    public void deleteStudent(Long id) {
        this.studentdao.deleteSingleStudent(id);
    }

    // Delete all students
    @Override
    public void deleteAll() {
        this.studentdao.deletingAllStudents();
    }
}
