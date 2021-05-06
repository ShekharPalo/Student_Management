package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudentParentVo;
import com.example.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@PostMapping("/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody StudentParentVo studentParentVo) {
		studentService.addStudent(studentParentVo);
		return new ResponseEntity<String>("Student Record added", HttpStatus.OK);
	}
}
