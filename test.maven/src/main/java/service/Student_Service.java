package service;

import java.util.List;

import entity.Student;

public interface Student_Service {
	
	// ��ѯ
	public List<Student> select(String where);
	
	// ��ѯ����
	public Student selectById(Integer id);
	
	// ����
	public void insert(Student s);
	
	// �޸�
	public void update(Student s);
	
	// ɾ��
	public void delete(Integer id);
}
