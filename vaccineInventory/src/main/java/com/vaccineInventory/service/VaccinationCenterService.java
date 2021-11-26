package com.vaccineInventory.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.vaccineInventory.entity.VaccinationCenter;
@Component
public interface VaccinationCenterService {
	
	public VaccinationCenter addVaccineCenter(VaccinationCenter center);
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center);
	public void deleteVaccineCenter(VaccinationCenter center);
	public VaccinationCenter getVaccineCenter(Integer code);
	public List<VaccinationCenter> getAllVaccineCenters();

}
