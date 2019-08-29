package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import entity.Grades;

@Repository
public interface Grades_Dao {
	// ��ѯȫ��
	public List<Grades> select(@Param("where") String where);

	// ��ѯһ��
	public Grades selectById(int id);

	// ����
	public void insert(Grades t);

	// �޸�
	public void update(Grades t);

	// ɾ��
	public void delete(int id);
}
