package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("index")
	public String index(String txt,ModelMap m) {
		m.put("info", txt);
		return "index";
	}
	
	@RequestMapping("Bindex")
	public String Bindex(String txt,ModelMap m) {
		m.put("info", txt);
		return "Bindex";
	}
}
