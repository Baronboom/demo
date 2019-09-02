package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Student;
import service.Student_Service;

@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	Student_Service stus;
	
	// ��ѯ
	@RequestMapping("index")
	public String index(String txt,ModelMap m) {
		String where = "";
		if(txt != null) {
			where = " where student.name like '%"+txt+"%'";
		}
		m.put("list", stus.select(where));
		return "Student/index";
	}
	
	// ����
	@RequestMapping("add")
	public String add(ModelMap m) {
		m.put("sublist", stus.selectgrades());
		return "Student/edit";
	}
	
	// ����
	@RequestMapping("insert")
	public String insert(Student s,ModelMap m) {
		stus.insert(s);
		return index(null,m);
	}
	
	// �޸�
	@RequestMapping("edit")
	public String edit(Integer id,ModelMap m) {
		m.put("info", stus.selectById(id));
		return add(m);
	}
	
	// �޸�
	@RequestMapping("update")
	public String update(Student s,ModelMap m) {
		stus.update(s);
		return index(null,m);
	}
	
	// ɾ��
	@RequestMapping("delete")
	public String delete(Integer id,ModelMap m) {
		stus.delete(id);
		return index(null,m);
	}
	
}
