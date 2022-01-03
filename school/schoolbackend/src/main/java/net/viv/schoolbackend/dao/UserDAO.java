package net.viv.schoolbackend.dao;

import java.util.List;

import net.viv.schoolbackend.dto.User;

public interface UserDAO {

	boolean add(User user);

	List<User> listActiveUsers();

	User getByEmail(String email);

}
