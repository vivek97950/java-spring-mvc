package net.viv.roomallotmentsystembackend.dao;

import java.util.List;

import net.viv.roomallotmentsystembackend.dto.Person;

public interface PersonDAO {

	Person get(int id);

	boolean add(Person person);

	boolean delete(Person person);

	List<Person> getAllPerson();
}
