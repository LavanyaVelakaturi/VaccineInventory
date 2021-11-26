package com.vaccineInventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccineInventory.entity.VaccinationCenter;
@Repository
public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, Integer>{

	
}
