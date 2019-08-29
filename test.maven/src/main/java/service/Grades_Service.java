package service;

import java.util.List;

import entity.Grades;

public interface Grades_Service {
	
	// 查询全部
	public List<Grades> select(String where);
	
	// 查询一个
	public Grades selectById(int id);
	
	// 新增
	public void insert(Grades t);
	
	// 修改
	public void update(Grades t);
	
	// 删除
	public void delete(int id);
}
