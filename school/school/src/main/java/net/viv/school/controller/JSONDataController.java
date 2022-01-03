package net.viv.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.viv.schoolbackend.dao.UserDAO;
import net.viv.schoolbackend.dto.User;

@Controller
@RequestMapping("/json/data")
public class JSONDataController {

	@Autowired
	private UserDAO userDAO;

	@RequestMapping("/all/users")
	@ResponseBody
	public List<User> getAllUsers() {
		return userDAO.listActiveUsers();
	}

}
