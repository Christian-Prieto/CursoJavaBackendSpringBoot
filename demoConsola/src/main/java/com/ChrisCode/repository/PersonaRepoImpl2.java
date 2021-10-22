package com.ChrisCode.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ChrisCode.DemoConsolaApplication;

@Repository
@Qualifier("persona2")
public class PersonaRepoImpl2 implements IPersona{

	private static Logger log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Override
	public void registrar(String pNombre) {
		log.info("se registro FELIZMENTE...a:" + pNombre);
		}
}

