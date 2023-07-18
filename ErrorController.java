package com.hospital.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hospital.exceptions.RecordNotFoundException;

@ControllerAdvice
public class ErrorController {
	
	@ExceptionHandler(RecordNotFoundException.class)
	public String recordNotFoundException(RecordNotFoundException ex, Model model) {
		model.addAttribute("error", ex.getMessage());
		return "recordnotfound";
	}
}
