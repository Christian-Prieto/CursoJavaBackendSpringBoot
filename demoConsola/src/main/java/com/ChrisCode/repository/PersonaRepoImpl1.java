package com.ChrisCode.repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ChrisCode.DemoConsolaApplication;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersona{

	private static Logger log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Override
	public void registrar(String pNombre) {
		log.info("se registro:" + pNombre);
		}
}

