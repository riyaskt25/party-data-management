package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

class EmployeeController {

	private List<Applicant> applicants = new CopyOnWriteArrayList<Applicant>();

	@Value("${database.username}")
	private String dbUser;

	@Value("${database.password}")
	private String dbPassword;

	public EmployeeController() {
		applicants.add(new Applicant(123L, "First Name 1", "Middle Name 1", "Last Name 1", "01", "01"));
		applicants.add(new Applicant(124L, "First Name 2", "Middle Name 2", "Last Name 2", "03", "02"));
		applicants.add(new Applicant(125L, "First Name 3", "Middle Name 3", "Last Name 3", "01", "03"));
	}

	@GetMapping("/applicants")
	public List<Applicant> listAllEmployees() {
		return applicants;
	}

	@GetMapping("/applicants/{id}")
	public Applicant getEmployee(@PathVariable("id") Long id) {
		Optional<Applicant> applicant = applicants.stream().filter(item -> item.getIdentificationNumber().equals(id))
				.findAny();
		if (applicants.isEmpty()) {
			return null;
		}
		return applicant.get();
	}

	@GetMapping("/dbu")
	public String getUserName() {
		return dbUser;
	}

	@GetMapping("/dbp")
	public String getEnv() {
		return dbPassword;
	}

}
