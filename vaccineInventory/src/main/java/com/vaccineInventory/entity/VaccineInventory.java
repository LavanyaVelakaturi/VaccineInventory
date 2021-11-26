package com.vaccineInventory.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity

public class VaccineInventory {
	@Id
	private int id;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate date;

	@OneToOne(cascade = CascadeType.ALL)
	private VaccinationCenter center;

	@OneToOne(cascade = CascadeType.ALL)
	private VaccineCount vaccineCount;

	

	public VaccineInventory() {
		super();
		
	}

	public VaccineInventory(int id, LocalDate date, VaccinationCenter center, VaccineCount vaccineCount) {
		super();
		this.id = id;
		this.date = date;
		this.center = center;
		this.vaccineCount = vaccineCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public VaccinationCenter getCenter() {
		return center;
	}

	public void setCenter(VaccinationCenter center) {
		this.center = center;
	}

	public VaccineCount getVaccineCount() {
		return vaccineCount;
	}

	public void setVaccineCount(VaccineCount vaccineCount) {
		this.vaccineCount = vaccineCount;
	}

}
