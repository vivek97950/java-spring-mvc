package net.viv.roomallotmentsystembackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dao.RoomDAO;
import net.viv.roomallotmentsystembackend.dto.Rooms;

@Repository("roomsDAO")
public class RoomsDAOImpl implements RoomDAO {

	@Override
	public Rooms get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Rooms room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Rooms room) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Rooms> getAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}

}
