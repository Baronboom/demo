package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import entity.Grades;
import entity.Student;

@Repository
public interface Student_Dao {
	// ��ѯȫ��
	@Select("select student.*,grades.name gradesname from student inner join grades on student.gradesid=grades.id ${where}")
	public List<Student> select(@Param("where") String where);
	
	@Select("select * from student where id = #{id}")
	public Student selectById(Integer id);
	
	// ��ѯ�༶
	@Select("select * from grades")
	public List<Grades> selectgrades();
	
	// ����
	@Insert("insert into student (name,sex,gradesid) values(#{name},#{sex},#{gradesid})")
	public void insert(Student s);
	
	// �޸�
	@Update("update student set name = #{name},sex = #{sex},gradesid=#{gradesid} where id = #{id}")
	public void update(Student s);
	
	// ɾ��
	@Delete("delete from student where id = #{id}")
	public void delete(Integer id);
}
