package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Grades_Dao;
import entity.Grades;
import service.Grades_Service;

@Service
public class Grades_Service_Impl implements Grades_Service{
	@Autowired
	Grades_Dao dao;
	
	// ��ѯȫ��
	public List<Grades> select(String where) {
		return dao.select(where);
	}

	// ��ѯһ��
	public Grades selectById(int id) {
		return dao.selectById(id);
	}
	
	// ����
	public void insert(Grades t) {
		dao.insert(t);
	}

	// �޸�
	public void update(Grades t) {
		dao.update(t);
		
	}

	// ɾ��
	public void delete(int id) {
		dao.delete(id);
	}

}
