package com.vaccineInventory.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vaccineInventory.entity.VaccineInventory;
import com.vaccineInventory.exception.VaccineInventoryException;
import com.vaccineInventory.repository.VaccineInventoryRepository;

@Service("vaccineInventoryService")
public class VaccineInventoryServiceImpl implements VaccineInventoryService {
	@Autowired
	private VaccineInventoryRepository vaccineInventoryRepository;

	@Override
	@ExceptionHandler
	public VaccineInventory addVaccineInventory(VaccineInventory inv) {
		try {
		return vaccineInventoryRepository.save(inv);
		}
		catch(IllegalArgumentException e) {
			throw new VaccineInventoryException("given data has empty values" +e.getMessage());
		}
		catch(Exception e) {
			throw new VaccineInventoryException("Something went wrong");
		}

	}

	@Override
	public VaccineInventory updateVaccineInventory(VaccineInventory inv) {
		try {
		return vaccineInventoryRepository.save(inv);
		}
		catch(IllegalArgumentException e) {
			throw new VaccineInventoryException("given id is empty,please check");
		}
		catch(java.util.NoSuchElementException e) {
			throw new VaccineInventoryException("Given id is doesn't exit in Database" +e.getMessage());
		}
	}

	@Override
	public void deleteVaccineInventory(VaccineInventory inv) {
		vaccineInventoryRepository.delete(inv);

	}

	@Override
	public VaccineInventory getVaccineInventoryByCenter(int centerid) {
		return vaccineInventoryRepository.getById(centerid);

	}

	 
	@Override
	public List<VaccineInventory> getAllVaccineInventory() {
		return vaccineInventoryRepository.findAll();

	}

}
