package com.hospital.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.Service.CustomUserService;
import com.hospital.Service.HospitalServiceImpl;
import com.hospital.models.HospitalRecords;
import com.hospital.models.UserData;

@Controller
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	CustomUserService userService;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	HospitalServiceImpl service;
	
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("records", service.getRecords());
		return "index";
	}
	
	@GetMapping("/add")
	public String addRecord(Model model) {
		HospitalRecords record=new HospitalRecords();
		model.addAttribute("records", record);
		return "addrecord";
	}
	
	@PostMapping("/saverecord")
	public String saveRecord(@ModelAttribute("records") HospitalRecords record) {
		service.saveRecord(record);
		return "redirect:/hospital/index";
	}
	
	@GetMapping("/delete")
	public String deleteRecord(@RequestParam("doctor_id") int doctor_id) {
		service.deleteRecord(doctor_id);
		return "redirect:/hospital/index";
	}
	
	@GetMapping("/update")
	public String updateRecord(@RequestParam("doctor_id") int doctor_id, Model model) {
		HospitalRecords record=service.getRecord(doctor_id);
		model.addAttribute("records", record);
		return "updaterecord";
	}
	
	@PostMapping("/updaterecord")
	public String updateRecord(@RequestParam("doctor_id") int doctor_id, @ModelAttribute("record") HospitalRecords record) {
		record.setDoctor_id(doctor_id);
		service.saveRecord(record);
		return "redirect:/hospital/index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("user", new UserData());
		return "register";
	}
	
	@PostMapping("/saveuser")
	public String saveUser(@ModelAttribute("user") UserData user) {
		user.setPasscode(encoder.encode(user.getPasscode()));
		userService.saveUser(user);
		return "redirect:/hospital/index";
	}
}