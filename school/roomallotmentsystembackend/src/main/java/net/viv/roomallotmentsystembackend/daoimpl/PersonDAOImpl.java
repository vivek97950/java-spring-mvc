package net.viv.roomallotmentsystembackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dao.PersonDAO;
import net.viv.roomallotmentsystembackend.dto.Person;

@Repository("personDAO")
public class PersonDAOImpl implements PersonDAO {

	@Override
	public Person get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return null;
	}
}
