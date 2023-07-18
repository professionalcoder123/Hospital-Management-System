package com.hospital.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.exceptions.RecordNotFoundException;
import com.hospital.models.HospitalRecords;
import com.hospital.repo.HospitalRecordsRepo;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	HospitalRecordsRepo repo;

	@Override
	public List<HospitalRecords> getRecords() {
		return repo.findAll();
	}

	@Override
	public void saveRecord(HospitalRecords record) {
		try {
			repo.save(record);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteRecord(int doctor_id) {
		Optional<HospitalRecords> record=repo.findById(doctor_id);
		if(record.isPresent()) {
			repo.delete(record.get());
		}
		else {
			throw new RecordNotFoundException("Record not found!");
		}
	}

	@Override
	public void updateRecord(HospitalRecords record) {
		Optional<HospitalRecords> recordToUpdate=repo.findById(record.getDoctor_id());
		if(recordToUpdate.isPresent()) {
			repo.save(recordToUpdate.get());
		}
		else {
			throw new RecordNotFoundException("Record not found!");
		}
	}

	@Override
	public HospitalRecords getRecord(int doctor_id) {
		Optional<HospitalRecords> record=repo.findById(doctor_id);
		if(record.isPresent()) {
			return record.get();
		}
		else {
			throw new RecordNotFoundException("Record not found!");
		}
	}

}
