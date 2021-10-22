package com.ChrisCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ChrisCode.model.Usuario;
import com.ChrisCode.repo.IUsuarioRepo;

@SpringBootTest
class IUsuarioRepoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Autowired
	IUsuarioRepo usuRepo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	void testAgregar() {
		Usuario usu = new Usuario(0, "user", encoder.encode("user"));
		Usuario usuRetorno = usuRepo.save(usu);
		assertEquals("user", usuRetorno.getNombre());
	
	}
}
