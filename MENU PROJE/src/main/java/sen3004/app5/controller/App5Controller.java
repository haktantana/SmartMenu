package sen3004.app5.controller;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import sen3004.app5.model.Order;
import sen3004.app5.model.Person;
import sen3004.app5.service.App5Service;

@Controller
public class App5Controller {

	@Autowired
	private App5Service service;

	@PostMapping("/add-to-cart-egg")
	public ModelAndView processForm(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Scrambled Egg");
		person.setPrice(2);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-waffle")
	public ModelAndView processForm2(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Waffle");
		person.setPrice(7);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-fries")
	public ModelAndView processForm3(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Home Fries");
		person.setPrice(3);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-cereal")
	public ModelAndView processForm4(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Cereal");
		person.setPrice(5);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-hamburger")
	public ModelAndView processForm5(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Hamburger");
		person.setPrice(9);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-chicken")
	public ModelAndView processForm6(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Butter Chicken");
		person.setPrice(18);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-sushi")
	public ModelAndView processForm7(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Sushi");
		person.setPrice(15);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-meatballs")
	public ModelAndView processForm8(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Sushi");
		person.setPrice(12);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-water")
	public ModelAndView processForm9(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Water");
		person.setPrice(1);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-lemonsoda")
	public ModelAndView processForm10(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Lemon Soda");
		person.setPrice(2);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-mocha")
	public ModelAndView processForm11(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Mocha");
		person.setPrice(4);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}

	@PostMapping("/add-to-cart-orangejuice")
	public ModelAndView processForm12(@Valid @ModelAttribute Person person, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		person.setpName("Orange Juice");
		person.setPrice(3);

		if (result.hasErrors())
			mv.setViewName("index");
		else {
			mv.setViewName("person-list");
			service.create(person);
			mv.addObject("persons", service.findAll());
		}

		return mv;
	}


	@GetMapping({ "/list-persons", "list.html" })
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView("person-list");
		mv.addObject("persons", service.findAll());
		
		return mv;
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable long id) {
		ModelAndView mv = new ModelAndView("person-list");
		service.delete(id);
		mv.addObject("persons", service.findAll());
			
		return mv;
	}

	@GetMapping({ "/display-order", "person-list.html" })
	public ModelAndView displayFormmmmm() {
		ModelAndView mv = new ModelAndView("person-list");
		mv.addObject("order", new Order());

		return mv;	
	}

	@PostMapping("/send-order")
	public ModelAndView processOrderForm(@Valid @ModelAttribute Order order, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("order", order);

		service.create(order);
		mv.setViewName("masa");
		service.deleteall();
		
		return mv;
	}

	@PostMapping("/enter-table-no")
	public ModelAndView processOrderForm123(@Valid @ModelAttribute Order order, BindingResult result) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("order", order);

		service.entertable(order);
		mv.setViewName("thanks");
		service.deleteall();
		
		return mv;
	}

}
