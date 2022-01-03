package net.viv.school.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.viv.school.model.UserModel;
import net.viv.school.utility.FileUploadUtility;
import net.viv.schoolbackend.dao.UserDAO;
import net.viv.schoolbackend.dto.User;

@Controller
public class PageController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index(@RequestParam(name = "success", required = false) String success) {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("greeting", "welcome to spring");

		User muserModel = new User();
		mv.addObject("userModel", muserModel);

		if (success != null) {
			if (success.equals("user")) {
				mv.addObject("message", "user added successfully!");
			}
		}

		return mv;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String managePostProduct(@Valid @ModelAttribute("userModel") User muserModel, BindingResult results,
			Model model, HttpServletRequest request) {

		if (!muserModel.getFile().getOriginalFilename().equals("")) {
			FileUploadUtility.uploadFile(request, muserModel.getFile(), muserModel.getCode());
		}

		if (muserModel.getId() == 0) {

			userDAO.add(muserModel);
		}

		return "redirect:/home/?success=user";
	}

	@RequestMapping(value = "/login")
	public ModelAndView login(@RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("title", "Login");
		if (error != null) {
			mv.addObject("message", "Username and Password is invalid!");
		}
		if (logout != null) {
			mv.addObject("logout", "You have logged out successfully!");
		}
		return mv;
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}

		return "redirect:/login?logout";
	}

	@RequestMapping(value = "/access-denied")
	public ModelAndView accessDenied() {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("errorTitle", "Aha! Caught You.");
		mv.addObject("errorDescription", "You are not authorized to view this page!");
		mv.addObject("title", "403 Access Denied");
		return mv;
	}

}
