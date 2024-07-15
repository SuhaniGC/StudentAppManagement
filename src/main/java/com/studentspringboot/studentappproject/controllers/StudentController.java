package com.studentspringboot.studentappproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.studentspringboot.studentappproject.entities.Student;
import com.studentspringboot.studentappproject.services.StudentService;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/createstudent")
    public String createStudent(Model model) {
        model.addAttribute("student", new Student());
        return "createstudent";
    }

    @PostMapping("/createstudent")
    public String createStudent(@ModelAttribute Student student) {
        studentService.addStudent(student);
        return "redirect:/viewstudent";
    }

    @GetMapping("/viewstudent")
    public String viewStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "viewstudent";
    }

    @GetMapping("/editstudent/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getSingleStudent(id));
        return "editstudent";
    }

    @PutMapping("/editstudent/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute Student student) {
        studentService.updateStudent(student);
        return "redirect:/viewstudent";
    }

    @DeleteMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/viewstudent";
    }

    @DeleteMapping("/deleteallstudents")
    public String deleteAllStudents() {
    studentService.deleteAll();
    return "redirect:/viewstudent";
    }

    @GetMapping("/viewstudent/{id}")
    public String viewStudentDetails(@PathVariable("id") Long id, Model model) {
        Student student = studentService.getSingleStudent(id);
        model.addAttribute("student", student);
        return "viewstudentdetails";
    }

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }
}