package net.viv.roomallotmentsystembackend.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Places implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int placeId;
	private String placeName;
	private String placeDiscription;
	private boolean isActive;
	private int divisionId;
	private String divisionName;

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	private Division division;

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getPlaceDiscription() {
		return placeDiscription;
	}

	public void setPlaceDiscription(String placeDiscription) {
		this.placeDiscription = placeDiscription;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
