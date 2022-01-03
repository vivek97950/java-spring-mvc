package net.viv.roomallotmentsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import net.viv.roomallotmentsystembackend.dao.DivisionDAO;
import net.viv.roomallotmentsystembackend.dao.NoticeDAO;
import net.viv.roomallotmentsystembackend.dao.PersonDAO;
import net.viv.roomallotmentsystembackend.dao.PlacesDAO;
import net.viv.roomallotmentsystembackend.dao.PurposeDAO;
import net.viv.roomallotmentsystembackend.dao.RoomDAO;
import net.viv.roomallotmentsystembackend.dto.Division;
import net.viv.roomallotmentsystembackend.dto.Notice;
import net.viv.roomallotmentsystembackend.dto.Person;
import net.viv.roomallotmentsystembackend.dto.Places;
import net.viv.roomallotmentsystembackend.dto.Purpose;
import net.viv.roomallotmentsystembackend.dto.Rooms;

@Controller
@RequestMapping("/manage")
public class ManagementController {

	@Autowired
	private PlacesDAO placesDAO;

	@Autowired
	private DivisionDAO divisionDAO;

	@Autowired
	private PersonDAO personDAO;

	@Autowired
	private RoomDAO roomsDAO;

	@Autowired
	private PurposeDAO purposeDAO;

	@Autowired
	private NoticeDAO noticeDAO;

	@RequestMapping(value = { "/reports" })
	public ModelAndView reports() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "reports");
		mv.addObject("userClickReports", true);

		return mv;
	}

	@RequestMapping(value = { "/rooms" })
	public ModelAndView rooms() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "rooms");
		mv.addObject("userClickRooms", true);

		return mv;
	}

	@RequestMapping(value = { "/setting" })
	public ModelAndView setting() {

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "setting");
		mv.addObject("userClickSetting", true);

		return mv;
	}

	@RequestMapping(value = { "/places" })
	public ModelAndView places() {

		Places nPlaces = new Places();

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "places");
		mv.addObject("userClickPlaces", true);
		mv.addObject("places", nPlaces);

		return mv;
	}

	@RequestMapping(value = "/places", method = RequestMethod.POST)
	public ModelAndView places(@Valid @ModelAttribute("places") Places mPlaces, BindingResult results, Model model,
			HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("page");

		return mv;
	}

	@RequestMapping(value = { "/division" })
	public ModelAndView division(@RequestParam(name = "success", required = false) String success) {

		Division nDivision = new Division();

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "division");
		mv.addObject("userClickDivision", true);

		mv.addObject("division", nDivision);

		if (success != null) {
			if (success.equals("division")) {
				mv.addObject("message", "division added successfully!");
			}
			if (success.equals("edited")) {
				mv.addObject("message", "division edited successfully!");
			}
		}

		return mv;
	}

	@RequestMapping(value = "/division", method = RequestMethod.POST)
	public String division(@Valid @ModelAttribute("division") Division mdivision, BindingResult results, Model model,
			HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("page");

		if (results.hasErrors()) {
			model.addAttribute("message", "Validation fails for adding the product!");
			model.addAttribute("userClickDivision", true);
			model.addAttribute("title", "division");
			return "page";
		}
		if (mdivision.getDivisionId() != 0) {
			if (divisionDAO.delete(mdivision))
				return "redirect:/manage/division?success=edited";

		}
		if (divisionDAO.add(mdivision))
			return "redirect:/manage/division?success=division";

		return "redirect:/manage/division";
	}

	@RequestMapping(value = "/{id}/division")
	public ModelAndView manageDivision(@PathVariable int id) {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "division");
		mv.addObject("userClickDivision", true);
		mv.addObject("division", divisionDAO.get(id));

		return mv;
	}

	@RequestMapping(value = "/division/{id}/edit", method = RequestMethod.GET)
	@ResponseBody
	public String manageDivisionEdit(@PathVariable int id) {
		Division division = divisionDAO.get(id);
		boolean isActive = divisionDAO.delete(division);
		return (isActive) ? "Division edited Successfully!" : "Division not edited";
	}

	@RequestMapping(value = { "/person" })
	public ModelAndView user() {

		Person nPerson = new Person();

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "person");
		mv.addObject("userClickPerson", true);

		mv.addObject("person", nPerson);

		return mv;
	}

	@RequestMapping(value = "/person", method = RequestMethod.POST)
	public ModelAndView user(@Valid @ModelAttribute("person") Person mPerson, BindingResult results, Model model,
			HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("page");

		return mv;
	}

	@RequestMapping(value = { "/add_rooms" })
	public ModelAndView addRooms() {

		Rooms nRoom = new Rooms();

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "add_rooms");
		mv.addObject("userClickAddRooms", true);

		mv.addObject("rooms", nRoom);

		return mv;
	}

	@RequestMapping(value = "/add_rooms", method = RequestMethod.POST)
	public ModelAndView addRooms(@Valid @ModelAttribute("rooms") Rooms mRoom, BindingResult results, Model model,
			HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("page");

		return mv;
	}

	@RequestMapping(value = { "/purpose" })
	public ModelAndView purpose() {

		Purpose nPurpose = new Purpose();

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "purpose");
		mv.addObject("userClickPurpose", true);

		mv.addObject("purpose", nPurpose);

		return mv;
	}

	@RequestMapping(value = "/purpose", method = RequestMethod.POST)
	public ModelAndView purpose(@Valid @ModelAttribute("purpose") Purpose mPurpose, BindingResult results, Model model,
			HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("page");

		return mv;
	}

	@RequestMapping(value = { "/notice" })
	public ModelAndView notice() {

		Notice nNotice = new Notice();

		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "notice");
		mv.addObject("userClickNotice", true);

		mv.addObject("notice", nNotice);

		return mv;
	}

	@RequestMapping(value = "/notice", method = RequestMethod.POST)
	public ModelAndView notice(@Valid @ModelAttribute("notice") Notice mNOtice, BindingResult results, Model model,
			HttpServletRequest request) {

		ModelAndView mv = new ModelAndView("page");

		return mv;
	}

	@ModelAttribute("divisions")
	public List<Division> modelCategories() {
		return divisionDAO.getAllDivision();
	}

}
