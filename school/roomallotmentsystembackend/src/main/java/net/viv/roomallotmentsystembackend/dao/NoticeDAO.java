package net.viv.roomallotmentsystembackend.dao;

import java.util.List;

import net.viv.roomallotmentsystembackend.dto.Notice;

public interface NoticeDAO {

	Notice get(int id);

	boolean add(Notice notice);

	boolean delete(Notice notice);

	List<Notice> getAllNotice();

}
