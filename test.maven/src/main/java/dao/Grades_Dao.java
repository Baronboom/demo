package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import entity.Grades;

@Repository
public interface Grades_Dao {
	// 查询全部
	public List<Grades> select(@Param("where") String where);

	// 查询一个
	public Grades selectById(int id);

	// 新增
	public void insert(Grades t);

	// 修改
	public void update(Grades t);

	// 删除
	public void delete(int id);
}
