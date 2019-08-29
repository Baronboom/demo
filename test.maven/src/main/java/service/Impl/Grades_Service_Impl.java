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
	
	// 查询全部
	public List<Grades> select(String where) {
		return dao.select(where);
	}

	// 查询一个
	public Grades selectById(int id) {
		return dao.selectById(id);
	}
	
	// 新增
	public void insert(Grades t) {
		dao.insert(t);
	}

	// 修改
	public void update(Grades t) {
		dao.update(t);
		
	}

	// 删除
	public void delete(int id) {
		dao.delete(id);
	}

}
