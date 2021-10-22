package com.ChrisCode.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ChrisCode.model.*;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNombre(String nombre);

}