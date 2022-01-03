package net.viv.schoolbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.viv.schoolbackend.dao.UserDAO;
import net.viv.schoolbackend.dto.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User getByEmail(String email) {
		String selectQuery = "FROM User WHERE email = :email";
		try {
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,User.class)
						.setParameter("email",email)
							.getSingleResult();
		}
		catch(Exception ex) {
			return null;
		}
							
	}
	
	@Override
	public boolean add(User user) {
		try {

			System.out.println(user.toString());

			sessionFactory.getCurrentSession().persist(user);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	@Override
	public List<User> listActiveUsers() {
		String selectActiveUsers = "FROM User WHERE enabled = :active";
		return sessionFactory.getCurrentSession().createQuery(selectActiveUsers, User.class)
				.setParameter("active", true).getResultList();
	}

}
