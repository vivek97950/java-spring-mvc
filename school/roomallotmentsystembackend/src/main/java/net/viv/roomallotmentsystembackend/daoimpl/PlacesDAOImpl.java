package net.viv.roomallotmentsystembackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dao.PlacesDAO;
import net.viv.roomallotmentsystembackend.dto.Places;

@Repository("placesDAO")
public class PlacesDAOImpl implements PlacesDAO {

	@Override
	public Places get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Places place) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Places place) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Places> getAllPlaces() {
		// TODO Auto-generated method stub
		return null;
	}

}
