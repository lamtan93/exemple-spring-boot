package dev.exemple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.exemple.entite.Exemple;
import dev.exemple.repository.ExempleRepository;

@RestController
@RequestMapping("/exemples")
public class ExempleApiController {
	
	@Autowired
	private ExempleRepository exempleRepo;

	@GetMapping
	public List<Exemple> listerexemples() {
		return this.exempleRepo.findAll();
	}
}