package net.viv.roomallotmentsystembackend.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.viv.roomallotmentsystembackend.dao.NoticeDAO;
import net.viv.roomallotmentsystembackend.dto.Notice;

@Repository("noticeDAO")
public class NoticeDAOImpl implements NoticeDAO {

	@Override
	public Notice get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Notice notice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Notice notice) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Notice> getAllNotice() {
		// TODO Auto-generated method stub
		return null;
	}

}
