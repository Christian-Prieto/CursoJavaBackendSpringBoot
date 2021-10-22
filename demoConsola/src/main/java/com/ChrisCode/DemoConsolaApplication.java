package com.ChrisCode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ChrisCode.service.IPersonaService;
import com.ChrisCode.service.PersonaServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {
	private static Logger Log = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Log.info("Impresion en consola: ");
		Log.warn("Advertencia: ");
		Log.error("Error: ");
		
		//service = new PersonaServiceImpl();
		service.registrarHandler("Chris");
		
	}

}
