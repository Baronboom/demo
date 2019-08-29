package service;

import java.util.List;

import entity.Student;

public interface Student_Service {
	
	// 查询
	public List<Student> select(String where);
	
	// 查询单个
	public Student selectById(Integer id);
	
	// 增加
	public void insert(Student s);
	
	// 修改
	public void update(Student s);
	
	// 删除
	public void delete(Integer id);
}
