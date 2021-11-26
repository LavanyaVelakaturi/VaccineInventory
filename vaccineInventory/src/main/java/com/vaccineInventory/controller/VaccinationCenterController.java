package com.vaccineInventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaccineInventory.entity.VaccinationCenter;
import com.vaccineInventory.service.VaccinationCenterService;
@RestController
@RequestMapping(value="/vaccinationCenter")
public class VaccinationCenterController {
	@Autowired
	private VaccinationCenterService vaccinationCenterService;
	
	@PostMapping("/add")
	public VaccinationCenter addVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		return vaccinationCenterService.addVaccineCenter(vaccinationCenter);
		
	}
	@PutMapping("/update")
	public VaccinationCenter updateVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		return vaccinationCenterService.updateVaccineCenter(vaccinationCenter);
		
	}
	@DeleteMapping("/delete")
	public void deleteVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
		 vaccinationCenterService.deleteVaccineCenter(vaccinationCenter);
		
	}
	@GetMapping("/vaccinationCenter/{code}")
	public  VaccinationCenter getVaccinationCenter(@PathVariable Integer code) {
		return vaccinationCenterService.getVaccineCenter(code);
		
	}
    @GetMapping("/allvaccineCenters")
    public List<VaccinationCenter> getAllVaccineCenters(){
		return vaccinationCenterService.getAllVaccineCenters();
		
	}
}
