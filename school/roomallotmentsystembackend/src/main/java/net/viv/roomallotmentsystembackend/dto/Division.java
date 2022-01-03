package net.viv.roomallotmentsystembackend.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class Division implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int divisionId;
	@NotBlank(message = "Please enter the product name!")
	private String divisionName;
	boolean isActive;

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

}
