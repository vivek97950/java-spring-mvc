package net.viv.roomallotmentsystembackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dto.Purpose;


public interface PurposeDAO {

	Purpose get(int id);

	boolean add(Purpose purpose);

	boolean delete(Purpose purpose);

	List<Purpose> getAllPurpose();

}
