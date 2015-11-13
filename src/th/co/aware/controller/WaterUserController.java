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

import th.co.aware.bean.History;
import th.co.aware.bean.User;
import th.co.aware.bean.WaterInformation;
import th.co.aware.services.HistoryService;
import th.co.aware.services.WaterUserService;

@Controller
@RequestMapping("/logged")
public class WaterUserController {

	@Autowired
	WaterUserService waterservice;
	
	@Autowired
	HistoryService historyservice;

	@RequestMapping("/check")
	public String check(HttpServletRequest request,ModelMap model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userlogin");
		//System.out.println(user.getW_id());
		if (user.getW_id() == 0) {
			 WaterInformation wif = new WaterInformation();
			 model.addAttribute("addinformation",wif);
			return "addinformation";
		} else {
			return "redirect:/logged/information";
		}
	}
	
	@RequestMapping(value = "/validateWaterUser", method = RequestMethod.POST)
	public String dovalidateWaterUser(@ModelAttribute("addinformation") WaterInformation wif, Model model,HttpServletRequest request) {
		System.out.println(wif.getW_branchno()+ " " + wif.getW_areano()+ " " + wif.getW_registrationno());
			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("userlogin");
			if(user!=null){
				System.out.println("user is not nul");
			}
			else{
				
				System.out.println("user is nul");
			}
		boolean validateResult = waterservice.validateWaterUser(wif.getW_branchno(), wif.getW_areano(), wif.getW_registrationno(),user);
		System.out.println(validateResult);
		if (validateResult) {
			request.getSession().setAttribute("wif", wif);
			System.out.println("validte true");
			return "redirect:/logged/information";
		} else {
			System.out.println("validte false");
			return "addinformation";
		}
	}
	
	@RequestMapping(value = "/addwateruser")
	public String indexPage() {
	
		return "redirect:/information";
	}
	
	@RequestMapping(value = "/information")
	public String information(ModelMap model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userlogin");
		WaterInformation keep =new WaterInformation();
		keep.setW_id(user.getW_id());
		WaterInformation wif1= waterservice.getWaterByid(keep);
		model.addAttribute("wif", wif1);
		return "information";
	}
	
	@RequestMapping(value = "/overdealbalance", method = RequestMethod.GET)
	public ModelAndView overdealBalance(ModelMap model) {
		return new ModelAndView("overdealbalance", "command", new User());
	}

	@RequestMapping(value = "/useaverage")
	public String useAverage(ModelMap model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("userlogin");
		History history = new History();
		history.setC_id(user.getC_id());
		model.addAttribute("historys", historyservice.getHistory(history));
		return "useaverage";
	}

}
