package com.vaccineInventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccineInventory.entity.VaccineInventory;
@Repository
public interface VaccineInventoryRepository extends JpaRepository<VaccineInventory, Integer>{

}
