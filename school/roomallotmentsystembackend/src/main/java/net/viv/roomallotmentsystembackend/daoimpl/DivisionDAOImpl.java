package net.viv.roomallotmentsystembackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.viv.roomallotmentsystembackend.dao.DivisionDAO;
import net.viv.roomallotmentsystembackend.dto.Division;

@Repository("devisionDAO")
@Transactional
public class DivisionDAOImpl implements DivisionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Division get(int id) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.openSession();
		Division div = new Division();
		try {
			SQLQuery selectQuery = session
					.createSQLQuery("" + "select division_id,division_name from division where division_id=?");
			selectQuery.setInteger(0, id);
			List<Object[]> rows = selectQuery.list();
			for (Object[] row : rows) {
				div.setDivisionId(Integer.parseInt(row[0].toString()));
				div.setDivisionName((row[1].toString()));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return div;
	}

	public boolean add(Division division) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		int i = 0;
		try {
			SQLQuery insertQuery = session.createSQLQuery("" + "INSERT INTO division(division_name)VALUES(?)");
			insertQuery.setParameter(0, division.getDivisionName());
			i = insertQuery.executeUpdate();
			tx.commit();

		} catch (Exception ex) {
			ex.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		if (i == 0)
			return false;
		else
			return true;

	}

	public boolean delete(Division division) {
		// TODO Auto-generated method stub
		int i = 0;
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Division div = new Division();
		try {
			SQLQuery updateQuery = session
					.createSQLQuery("" + "update division set division_name=? where division_id=?");
			updateQuery.setParameter(0, division.getDivisionName());
			updateQuery.setInteger(1, division.getDivisionId());
			i = updateQuery.executeUpdate();
			tx.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}
		if (i == 0)
			return false;
		else
			return true;

	}

	public List<Division> getAllDivision() {
		Session session = sessionFactory.openSession();
		SQLQuery selectQuery = session.createSQLQuery("" + "select division_id,division_name from division");
		List<Division> divList = new ArrayList();
		try {
			List<Object[]> rows = selectQuery.list();
			for (Object[] row : rows) {
				Division div = new Division();
				div.setDivisionId(Integer.parseInt(row[0].toString()));
				div.setDivisionName((row[1].toString()));
				divList.add(div);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return divList;

	}

}
