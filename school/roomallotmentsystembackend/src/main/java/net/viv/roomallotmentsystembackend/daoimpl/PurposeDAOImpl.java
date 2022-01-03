package net.viv.roomallotmentsystembackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dao.PurposeDAO;
import net.viv.roomallotmentsystembackend.dto.Purpose;

@Repository("purposeDAO")
public class PurposeDAOImpl implements PurposeDAO {

	@Override
	public Purpose get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Purpose purpose) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Purpose purpose) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Purpose> getAllPurpose() {
		// TODO Auto-generated method stub
		return null;
	}

}
