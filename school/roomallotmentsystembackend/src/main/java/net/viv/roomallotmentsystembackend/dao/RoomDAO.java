package net.viv.roomallotmentsystembackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dto.Rooms;


public interface RoomDAO {

	Rooms get(int id);

	boolean add(Rooms room);

	boolean delete(Rooms room);

	List<Rooms> getAllRooms();
}
