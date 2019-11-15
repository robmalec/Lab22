package co.grandcircus.lab22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegFormController {
	private User u;

	@PostMapping("/confirmation")
	public ModelAndView makeConfirmation(@RequestParam("first") String firstName, 
			@RequestParam("last")String lastName, 
			@RequestParam("email")String email,
			@RequestParam("phone")String phoneNum,
			@RequestParam("password")String password) {
			
			User uFromForm = new User(firstName, lastName, email, phoneNum, password);
		return new ModelAndView("confirmation", "u", uFromForm);
	}
}
