package com.vaccineInventory.service;

//import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vaccineInventory.entity.VaccineInventory;
@Component
public interface VaccineInventoryService {

	
	public VaccineInventory addVaccineInventory(VaccineInventory inv);
	
	public VaccineInventory updateVaccineInventory(VaccineInventory inv);
	
	public void deleteVaccineInventory(VaccineInventory inv);
	public VaccineInventory getVaccineInventoryByCenter(int centerid);
	
	public List<VaccineInventory> getAllVaccineInventory();
}
