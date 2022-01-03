package net.viv.schoolbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.viv.schoolbackend.dao.UserDAO;
import net.viv.schoolbackend.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private User user = null;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.viv.schoolbackend");
		context.refresh();

		userDAO = (UserDAO) context.getBean("userDAO");
	}

	@Test
	public void testAddUser() {

		user = new User();
		user.setFirstName("VIVEK");
		user.setLastName("DIXIT");
		user.setEmail("vk@gmail.com");
		user.setContactNumber("1234512345");
		user.setRole("STUDENT");
		user.setEnabled(true);
		user.setPassword("98765");
		user.setCode("jpeg");

		assertEquals("Failed to add the user!", true, userDAO.add(user));

	}

}
