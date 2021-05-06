package com.example.service;

import org.springframework.beans.BeanUtils;

import com.example.domain.Parent;
import com.example.domain.Student;
import com.example.model.StudentParentVo;
import com.example.repository.ParentRepository;
import com.example.repository.StudentRepository;

public class StudentService implements IStudentService {

	private StudentRepository studentRepo;
	private ParentRepository parentRepo;

	@Override
	public void addStudent(StudentParentVo spVo) {
		Student student = new Student();
		BeanUtils.copyProperties(spVo, student);
		studentRepo.saveAndFlush(student);

		Parent parent = new Parent();
		BeanUtils.copyProperties(spVo, parent);
		parent.setstdId(student);
		parentRepo.saveAndFlush(parent);

	}
}