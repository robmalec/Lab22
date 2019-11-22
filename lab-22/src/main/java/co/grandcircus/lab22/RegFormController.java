package co.grandcircus.lab22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab22.dao.UserRepo;
import co.grandcircus.lab22.model.User;

@Controller
public class RegFormController {
	private User u;
	
	@Autowired
	UserRepo dao;

	@PostMapping("/confirmation")
	public ModelAndView makeConfirmation(@RequestParam("first") String firstName, 
			@RequestParam("last")String lastName, 
			@RequestParam("email")String email,
			@RequestParam("phone")String phoneNum,
			@RequestParam("password")String password) {
			
			User uFromForm = new User(firstName, lastName, email, phoneNum, password);
			
			dao.save(uFromForm);
			//dao.save(uFromForm.getFirstName(), uFromForm.getLastName(), uFromForm.getEmail(), uFromForm.getPhoneNum(), uFromForm.getPassword());
		return new ModelAndView("confirmation", "u", uFromForm);
	}
	
}
