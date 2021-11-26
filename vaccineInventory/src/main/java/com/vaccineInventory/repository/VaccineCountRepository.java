package com.vaccineInventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccineInventory.entity.VaccineCount;
@Repository
public interface VaccineCountRepository extends JpaRepository<VaccineCount, Integer>{

}
