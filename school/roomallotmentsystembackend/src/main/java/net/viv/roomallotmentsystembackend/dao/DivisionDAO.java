package net.viv.roomallotmentsystembackend.dao;

import java.util.List;

import net.viv.roomallotmentsystembackend.dto.Division;

public interface DivisionDAO {

	Division get(int id);

	boolean add(Division division);

	boolean delete(Division division);

	List<Division> getAllDivision();

}
