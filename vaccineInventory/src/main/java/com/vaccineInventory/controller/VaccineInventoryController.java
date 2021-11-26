package com.vaccineInventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaccineInventory.entity.VaccineInventory;
import com.vaccineInventory.service.VaccineInventoryService;
@RestController
@RequestMapping(value="/inventory")
public class VaccineInventoryController {
	@Autowired
	private VaccineInventoryService vaccineInventoryService;
	
	@PostMapping("/add")
	public VaccineInventory addVaccineInventory(@RequestBody VaccineInventory vaccineInventory) {
	
		return vaccineInventoryService.addVaccineInventory(vaccineInventory);
		 
	}
	@PutMapping("/update")
	public VaccineInventory updateVaccineInventory(@RequestBody VaccineInventory vaccineInventory) {
		return vaccineInventoryService.updateVaccineInventory(vaccineInventory);
		 
		
	}
	@DeleteMapping("/delete")
	public void deleteVaccineInventory(@RequestBody VaccineInventory vaccineInventory) {
		 vaccineInventoryService.deleteVaccineInventory(vaccineInventory);
	 
	
	}
	@GetMapping("/vaccineInventory/{centerId}")
	public VaccineInventory getVaccineInventoryByCenter(@RequestBody int centerid) {
		return vaccineInventoryService.getVaccineInventoryByCenter(centerid);
		
	}
	@GetMapping("/vaccineInventory")
	public List<VaccineInventory> getAllVaccineInventory(){
		return vaccineInventoryService.getAllVaccineInventory();
	}
	

}
