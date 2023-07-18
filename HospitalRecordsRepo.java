package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.models.HospitalRecords;

public interface HospitalRecordsRepo extends JpaRepository<HospitalRecords, Integer> {

}
