package com.ChrisCode.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ChrisCode.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}