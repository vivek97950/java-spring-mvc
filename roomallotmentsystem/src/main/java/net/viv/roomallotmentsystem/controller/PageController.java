package net.viv.roomallotmentsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index(@RequestParam(name = "success", required = false) String success) {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "home");
		mv.addObject("userClickHome", true);

		return mv;
	}

	@RequestMapping(value = { "/availability" })
	public ModelAndView availability() {
		System.out.println("i am here--------------------------------------------------------------------------------------------------------------------------------------");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "availability");
		mv.addObject("userClickAvailability", true);

		return mv;
	}

	@RequestMapping(value = { "/new_booking" })
	public ModelAndView newBooking() {
		System.out.println("i am here--------------------------------------------------------------------------------------------------------------------------------------");
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "newBooking");
		mv.addObject("userClickNewBooking", true);

		return mv;
	}

}
