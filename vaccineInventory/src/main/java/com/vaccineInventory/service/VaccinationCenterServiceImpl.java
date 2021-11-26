package com.vaccineInventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccineInventory.entity.VaccinationCenter;
import com.vaccineInventory.repository.VaccinationCenterRepository;
@Service("vaccinationCenterService")
public class VaccinationCenterServiceImpl implements VaccinationCenterService{

	@Autowired
	public VaccinationCenterRepository vaccinationCenterRepository;
	
	@Override
	public VaccinationCenter addVaccineCenter(VaccinationCenter center) {
		
		return vaccinationCenterRepository.save(center);
	}

	@Override
	public VaccinationCenter updateVaccineCenter(VaccinationCenter center) {
		
		return vaccinationCenterRepository.save(center);
	}

	@Override
	public void deleteVaccineCenter(VaccinationCenter center) {
		
		vaccinationCenterRepository.delete(center);
	}

	@Override
	public VaccinationCenter getVaccineCenter(Integer code) {
		
		return vaccinationCenterRepository.getById(code);
	}

	@Override
	public List<VaccinationCenter> getAllVaccineCenters() {
		
		return vaccinationCenterRepository.findAll();
	}

}
