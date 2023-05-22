package com.hungphan.demo.Controller;

import com.hungphan.demo.Model.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class StudentController {
    private List<StudentModel> list = new ArrayList<>();

    @PostMapping("student1")
    public ResponseEntity<?> student1(@RequestParam String name, @RequestParam int age) {
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("student2")
    public ResponseEntity<?> student2(@RequestBody StudentModel studentModel) {
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
