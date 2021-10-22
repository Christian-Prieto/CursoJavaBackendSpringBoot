package com.ChrisCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ChrisCode.model.Persona;
import com.ChrisCode.repo.IPersonaRepo;

@SpringBootApplication
public class DemoWebApplication {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		if(name==null|| name.isEmpty()) {
			name = "AlvaroCodigo";
		}
		Persona persona = new Persona(0, name);
		repo.save(persona);
		
		model.addAttribute("name", name);
		
		return "greeting";
	}
}
