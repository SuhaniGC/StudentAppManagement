package com.studentspringboot.studentappproject.dao;

import com.studentspringboot.studentappproject.entities.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    private EntityManager entityManager;

    
    @Override
    public List<Student> givingAllStudents() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    // Retrieve a single student by their ID
    @Override
    public Student getSingleStudent(Long id) {
        return entityManager.find(Student.class, id);
    }

    // Add a new student to the database
    @Override
    public Student addSingleStudent(Student student) {
        entityManager.persist(student);
        return student;
    }

    // Update an existing student in the database
    @Override
    public Student updateSingleStudent(Student newStudent) {
        Long id = newStudent.getId();
        Student existingStudent = getSingleStudent(id);
        if (existingStudent != null) {
            existingStudent.setName(newStudent.getName());
            existingStudent.setEmail(newStudent.getEmail());
            existingStudent.setPhoneNo(newStudent.getPhoneNo());
            return existingStudent;
        }
        return null;
    }

    // Delete a single student by their ID
    @Override
    public void deleteSingleStudent(Long id) {
        Student student = getSingleStudent(id);
        if (student != null) {
            entityManager.remove(student);
        }
    }

    // Delete all students from the database
    @Override
    public void deletingAllStudents() {
        entityManager.createQuery("DELETE FROM Student").executeUpdate();
    }
}
