package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Grades;
import service.Grades_Service;

@Controller
@RequestMapping("Type")
public class GradesController {
	@Autowired
	Grades_Service service;

	// 异常处理
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}

	@RequestMapping("index")
	public String index(String txt,ModelMap m) {
		String where = "";
		if(txt != null) {
			where = " where grades.name like '%"+txt+"%'";
		}
		m.put("list", service.select(where));
		return "Gradesindex";
	}

	// 新增
	@RequestMapping("add")
	public String add(ModelMap m) {
		return "Gradesedit";
	}
	
	// 新增
	@RequestMapping("insert")
	public String insert(Grades b, ModelMap m) {
		service.insert(b);
		return index(null,m);
	}
	
	// 修改
	@RequestMapping("edit")
	public String edit(int id, ModelMap m) {
		m.put("info", service.selectById(id));
		return "Gradesedit";
	}

	// 修改
	@RequestMapping("update")
	public String update(Grades b, ModelMap m) {
		service.update(b);
		return index(null,m);
	}

	// 删除
	@RequestMapping("delete")
	public String delete(int id, ModelMap m) {
		service.delete(id);
		return index(null,m);
	}
}
