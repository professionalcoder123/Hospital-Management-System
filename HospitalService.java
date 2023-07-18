package com.hospital.Service;

import java.util.List;

import com.hospital.models.HospitalRecords;

public interface HospitalService {
	public List<HospitalRecords> getRecords();
	public void saveRecord(HospitalRecords record);
	public void deleteRecord(int doctor_id);
	public void updateRecord(HospitalRecords record);
	public HospitalRecords getRecord(int doctor_id);
}
