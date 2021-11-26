package com.vaccineInventory.repository;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vaccineInventory.entity.VaccinationCenter;
import com.vaccineInventory.entity.VaccineCount;
import com.vaccineInventory.entity.VaccineInventory;

@SpringBootTest
class VaccineInventoryRepositoryTest {

	/*@Test
	void contextLoads() {
	}*/
	@Autowired
	private VaccineInventoryRepository vaccineInventoryRepository;
	@Test
	public void saveVaccineInventory() {
		
		VaccinationCenter vaccinationCenter=new VaccinationCenter(101,"Covid center","pakala","Chittoor","Andhra","517112");
		VaccineCount vaccineCount=new VaccineCount(2,500);
		VaccineInventory vaccineInventory=new VaccineInventory(1,LocalDate.of(2021, 9, 20),vaccinationCenter,vaccineCount);//
		vaccineInventoryRepository.save(vaccineInventory);
	}
	
	@Test
	public void deleteVaccineInventory() {
		VaccinationCenter vaccinationCenter=new VaccinationCenter(101,"Covid center","pakala","Chittoor","Andhra","517112");
		VaccineCount vaccineCount=new VaccineCount(2,500);
		VaccineInventory vaccineInventory=new VaccineInventory(1,LocalDate.of(2021, 9, 20),vaccinationCenter,vaccineCount);//
		vaccineInventoryRepository.delete(vaccineInventory);	
	}
	@Test
	public void updateVaccineInventory() {
		VaccinationCenter vaccinationCenter=new VaccinationCenter(102,"Covid1 center","pakala","Chittoor","Andhra","517112");
		VaccineCount vaccineCount=new VaccineCount(3,500);
		VaccineInventory vaccineInventory=new VaccineInventory(3,LocalDate.of(2021, 9, 20),vaccinationCenter,vaccineCount);//
		vaccineInventoryRepository.save(vaccineInventory);	
	}
	@Test
	public void printAllVaccineInventory() {
		List<VaccineInventory> vaccineInventoryList=vaccineInventoryRepository.findAll();
		System.out.println("vaccineInventoryList="+vaccineInventoryList);
	}
	
}
