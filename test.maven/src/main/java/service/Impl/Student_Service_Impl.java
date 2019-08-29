package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Student_Dao;
import entity.Student;
import service.Student_Service;

@Service
public class Student_Service_Impl implements Student_Service {
	
	@Autowired
	Student_Dao sd;

	public List<Student> select(String where) {
		return sd.select(where);
	}

	public void insert(Student s) {
		sd.insert(s);
	}

	public void update(Student s) {
		sd.update(s);
	}

	public void delete(Integer id) {
		sd.delete(id);
	}

	public Student selectById(Integer id) {
		return sd.selectById(id);
	}
	
}
