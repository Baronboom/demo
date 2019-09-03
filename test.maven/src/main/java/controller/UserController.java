package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.User_Service;

@Controller
@RequestMapping("User")
public class UserController {
	@Autowired
	User_Service service;

	// �쳣����
	@ExceptionHandler
	public void ex(Exception e) {
		e.printStackTrace();
	}
	
	
	@RequestMapping("login")
	public String login(User u,ModelMap m,HttpSession s) {
		User user = service.login(u);
		if(user!=null) {
			s.setMaxInactiveInterval(20);
			s.setAttribute("user", user);
			return "index";
		}else {
			return "redirect:/login.html";
		}
	}
	
	@RequestMapping("outlogin")
	public String login(HttpSession s) {
		s.removeAttribute("user");
		return "redirect:../login.html";
	}

	@RequestMapping("index")
	public String index(String txt,ModelMap m) {
		String where = "";
		if(txt != null) {
			where = " where grades.name like '%"+txt+"%'";
		}
		m.put("list", service.select(where));
		return "User/index";
	}

	// ����
	@RequestMapping("add")
	public String add(ModelMap m) {
		return "User/edit";
	}
	
	// ����
	@RequestMapping("insert")
	public String insert(User b, ModelMap m) {
		service.insert(b);
		return index(null,m);
	}
	
	// �޸�
	@RequestMapping("edit")
	public String edit(int id, ModelMap m) {
		m.put("info", service.selectById(id));
		return "User/edit";
	}

	// �޸�
	@RequestMapping("update")
	public String update(User b, ModelMap m) {
		service.update(b);
		return index(null,m);
	}

	// ɾ��
	@RequestMapping("delete")
	public String delete(int id, ModelMap m) {
		service.delete(id);
		return index(null,m);
	}
}
