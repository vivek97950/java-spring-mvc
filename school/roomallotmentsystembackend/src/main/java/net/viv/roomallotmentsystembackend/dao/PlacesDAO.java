package net.viv.roomallotmentsystembackend.dao;

import java.util.List;

import net.viv.roomallotmentsystembackend.dto.Places;

public interface PlacesDAO {

	Places get(int id);

	boolean add(Places place);

	boolean delete(Places place);

	List<Places> getAllPlaces();

}
