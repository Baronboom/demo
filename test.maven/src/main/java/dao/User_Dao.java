package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public interface User_Dao {
	
	// ��¼����
	@Select("select * from User where name = #{name} and pass = #{pass}")
	public User login(User u);
	
	// ��ѯȫ��
	public List<User> select(@Param("where") String where);

	// ��ѯһ��
	public User selectById(int id);

	// ����
	public void insert(User t);

	// �޸�
	public void update(User t);

	// ɾ��
	public void delete(int id);
}
