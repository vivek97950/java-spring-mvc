package net.viv.roomallotmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.viv.roomallotmentsystembackend.dao.DivisionDAO;
import net.viv.roomallotmentsystembackend.dto.Division;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	private DivisionDAO divisionDAO;

	@RequestMapping("/all/division")
	@ResponseBody
	public List<Division> getAllDivision() {
		return divisionDAO.getAllDivision();

	}
}
