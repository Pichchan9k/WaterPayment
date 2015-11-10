package th.co.aware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import th.co.aware.bean.User;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("")
	public String indexPage(){
		return "index"; 
	}

	@RequestMapping("/login")
	public ModelAndView login(ModelMap model) {
		model.addAttribute("user", new User());
		return new ModelAndView("login", model);
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelMap model) {
		model.addAttribute("user", new User());
		return new ModelAndView("register", model);
	}
}
