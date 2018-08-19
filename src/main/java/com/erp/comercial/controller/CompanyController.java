package com.erp.comercial.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.comercial.model.Company;
import com.erp.comercial.repository.CompanyRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CompanyController {

	@Autowired
    CompanyRepository companyRepository;
	
	@GetMapping("/companies")
	public List<Company> getAllCompanies(){
		return companyRepository.findAll();
	}
	
}
