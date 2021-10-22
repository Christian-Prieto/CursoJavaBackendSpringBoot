package com.ChrisCode.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ChrisCode.model.Persona;
import com.ChrisCode.model.Usuario;
import com.ChrisCode.repo.IPersonaRepo;
import com.ChrisCode.repo.IUsuarioRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@Autowired
	private IUsuarioRepo usuRepo;
	
	@GetMapping
	public List<Persona> lista(){		
		return repo.findAll();
		
	}
	
	@RequestMapping("/users")
	public List<Usuario> listaUsuarios(){
		return usuRepo.findAll();
		
	}
	
	@PostMapping
	public void insertar(@RequestBody Persona person) {
		repo.save(person);
	}
	
	@RequestMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
		
	}

}
