package net.viv.school.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import net.viv.school.model.UserModel;
import net.viv.schoolbackend.dao.UserDAO;
import net.viv.schoolbackend.dto.User;

@EnableWebMvc
@ControllerAdvice
public class GlobalController {

	@Autowired
	private UserDAO userDAO;

	@Autowired
	private HttpSession session;

	private UserModel userModell = null;
	private User user = null;

	@ModelAttribute("userModell")
	public UserModel getUserModel() {
		if (session.getAttribute("userModell") == null) {

			System.out.println(
					"i am in global controller.....................................................................");
			// get the authentication object
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

			if (!authentication.getPrincipal().equals("anonymousUser")) {
				// get the user from the database
				user = userDAO.getByEmail(authentication.getName());

				if (user != null) {

					System.out.println(
							"i am in global controller.....................abc................................................");
					System.out.println(authentication.getName());
					// create a new model
					userModell = new UserModel();
					// set the name and the id
					userModell.setId(user.getId());
					userModell.setFullName(user.getFirstName() + " " + user.getLastName());
					System.out.println(user.getFirstName());
					System.out.println(userModell.getFullName());
					userModell.setRole(user.getRole());
					session.setAttribute("userModell", userModell);
					return userModell;
				}
			}
		}
		return (UserModel) session.getAttribute("userModell");
	}
}
