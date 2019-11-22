package co.grandcircus.lab22;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab22.dao.ProductRepo;
import co.grandcircus.lab22.model.Product;

@Controller
public class MainController {

	@Autowired
	ProductRepo dao;

	@RequestMapping("/")
	public ModelAndView makeHomePage() {
		ModelAndView mv = new ModelAndView("index");

		List<Product> productList = dao.findAll();

		if (productList.size() == 0) {
			fillMenu();
			productList = dao.findAll();
		} else {

			double total = 0.0;

			for (Product p : productList) {
				total += (p.getPrice() * p.getQuantity());
			}

			mv.addObject("productList", productList);
			mv.addObject("total", total);
		}
		return mv;
		// return new ModelAndView("index", "productList", dao.findAll());
	}

	@RequestMapping("/regForm")
	public ModelAndView makeRegForm() {
		return new ModelAndView("regForm");
	}

	@RequestMapping("/addOne")
	public ModelAndView addOne(int id) {
		System.out.println("printed");
		Product p = dao.findById(id).orElse(null);

		p.setQuantity(p.getQuantity() + 1);

		dao.save(p);

		return new ModelAndView("redirect:/");
	}

	public void fillMenu() {
		String description = "The only thing more bitter than our beans is the fact that they'll always be funnier than you.";
		dao.save(new Product(0, 0, 2.99, "Steak House Blend", description));
		dao.save(new Product(1, 0, 4.99, "Steak Mocha", description));
		dao.save(new Product(2, 0, 4.99, "Steakacchino", description));
		dao.save(new Product(3, 0, 3.99, "Steak Latte", description));
	}

}
