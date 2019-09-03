package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import entity.User;

@Repository
public interface User_Dao {
	
	// 登录方法
	@Select("select * from User where name = #{name} and pass = #{pass}")
	public User login(User u);
	
	// 查询全部
	public List<User> select(@Param("where") String where);

	// 查询一个
	public User selectById(int id);

	// 新增
	public void insert(User t);

	// 修改
	public void update(User t);

	// 删除
	public void delete(int id);
}
