package com.hospital.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class HospitalRecords {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int doctor_id;
	
	@Column
	@NotBlank(message="Doctor's name cannot be blank")
	private String doctor_name;
	
	@Column
	@NotBlank(message="Patient's age cannot be blank")
	private String doctor_age;
	
	@Column
	@NotBlank(message="Patient's gender cannot be blank")
	private String doctor_gender;
	
	@Column
	@NotBlank(message="Doctor's specialization cannot be blank")
	private String doctor_spec;
	
	@Column
	@NotBlank(message="Patient's name cannot be blank")
	private String patient_name;
	
	@Column
	@NotBlank(message="Patient's age cannot be blank")
	private String patient_age;
	
	@Column
	@NotBlank(message="Patient's gender cannot be blank")
	private String patient_gender;
	
	@Column
	@NotBlank(message="Disease occurred to patient cannot be blank")
	private String patient_disease;
	
	@Column
	@NotBlank(message="Test performed on patient cannot be blank")
	private String test_name;
	
	@Column
	@NotBlank(message="Test result cannot be blank")
	private String test_result;
	
	@Column
	@NotBlank(message="Medicine given to patient cannot be blank")
	private String medicine_name;
	
	@Column
	@Min(value=100, message="Minimum value must be Rs.100")
	@Max(value=10000, message="Maximum value must be Rs.10000")
	private float total_cost;

	public HospitalRecords(int doctor_id, @NotBlank(message = "Doctor's name cannot be blank") String doctor_name,
			@NotBlank(message = "Patient's age cannot be blank") String doctor_age,
			@NotBlank(message = "Patient's gender cannot be blank") String doctor_gender,
			@NotBlank(message = "Doctor's specialization cannot be blank") String doctor_spec,
			@NotBlank(message = "Patient's name cannot be blank") String patient_name,
			@NotBlank(message = "Patient's age cannot be blank") String patient_age,
			@NotBlank(message = "Patient's gender cannot be blank") String patient_gender,
			@NotBlank(message = "Disease occurred to patient cannot be blank") String patient_disease,
			@NotBlank(message = "Test performed on patient cannot be blank") String test_name,
			@NotBlank(message = "Test result cannot be blank") String test_result,
			@NotBlank(message = "Medicine given to patient cannot be blank") String medicine_name,
			@Min(value = 100, message = "Minimum value must be Rs.100") @Max(value = 10000, message = "Maximum value must be Rs.10000") float total_cost) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doctor_age = doctor_age;
		this.doctor_gender = doctor_gender;
		this.doctor_spec = doctor_spec;
		this.patient_name = patient_name;
		this.patient_age = patient_age;
		this.patient_gender = patient_gender;
		this.patient_disease = patient_disease;
		this.test_name = test_name;
		this.test_result = test_result;
		this.medicine_name = medicine_name;
		this.total_cost = total_cost;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getDoctor_age() {
		return doctor_age;
	}

	public void setDoctor_age(String doctor_age) {
		this.doctor_age = doctor_age;
	}

	public String getDoctor_gender() {
		return doctor_gender;
	}

	public void setDoctor_gender(String doctor_gender) {
		this.doctor_gender = doctor_gender;
	}

	public String getDoctor_spec() {
		return doctor_spec;
	}

	public void setDoctor_spec(String doctor_spec) {
		this.doctor_spec = doctor_spec;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(String patient_age) {
		this.patient_age = patient_age;
	}

	public String getPatient_gender() {
		return patient_gender;
	}

	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}

	public String getPatient_disease() {
		return patient_disease;
	}

	public void setPatient_disease(String patient_disease) {
		this.patient_disease = patient_disease;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public String getTest_result() {
		return test_result;
	}

	public void setTest_result(String test_result) {
		this.test_result = test_result;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public float getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(float total_cost) {
		this.total_cost = total_cost;
	}

	public HospitalRecords() {
		super();
	}
}