package service;

import java.util.List;

import entity.Grades;

public interface Grades_Service {
	
	// ��ѯȫ��
	public List<Grades> select(String where);
	
	// ��ѯһ��
	public Grades selectById(int id);
	
	// ����
	public void insert(Grades t);
	
	// �޸�
	public void update(Grades t);
	
	// ɾ��
	public void delete(int id);
}
