package th.co.aware.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import th.co.aware.bean.User;
import th.co.aware.services.UserService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	UserService userservice;

	@RequestMapping("")
	public String indexPage() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(ModelMap model) {
		return new ModelAndView("login", "command", new User());
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(ModelMap model) {
		return new ModelAndView("register", "command", new User());
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String inserData(@ModelAttribute User user) {
		if (user != null)
			userservice.insertUser(user);
		return "redirect:";
	}

	@RequestMapping(value = "/validateLogin", method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("login") User user, Model model,HttpServletRequest request) {
		User loginResult = userservice.validateLogin(user.getC_username(), user.getC_password(),user.getC_id());
		if (loginResult != null) {
			HttpSession session = request.getSession();
			session.setAttribute("userlogin",userservice.getUser(user.getC_username(), user.getC_password(),user.getC_id()));
			return "redirect:/home";
		} else {
			return "redirect:/login";
		}
	}
	
	@RequestMapping("home")
	public String tohome() {
		return "home";
	}

}
