package co.grandcircus.lab22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView makeHomePage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/regForm")
	public ModelAndView makeRegForm(){
		return new ModelAndView("regForm");
	}
	
	
}
