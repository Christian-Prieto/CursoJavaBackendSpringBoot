package com.domain.modelo.dao.selectStrategy.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.inetum.elementos.modelo.Alumno;
import com.domain.modelo.dao.selectStrategy.SelectStrategy;



public class SelectStrategyTest {
	Alumno aluVacio					;
	Alumno aluConCodigo				;
	Alumno aluConNombre				;	
	Alumno aluConNombreYapellido	;
	Alumno aluconEstudio			;
	Alumno aluConNombreEstudiosLink ;
	@Before
	public void setUp() throws Exception {
		aluVacio				= new Alumno()									;
		aluConCodigo 			= new Alumno(10)								;
		aluConNombre 			= new Alumno(0, "Gabriel",null, null, null)		;
		aluConNombreYapellido 	= new Alumno(0, "Gabriel", "Casas", null, null)	;	
		aluconEstudio 			= new Alumno(0, null, null, "DAM", null)		;
		aluConNombreEstudiosLink =new Alumno(0, "Gabriel", null, "DAM", "http://gitlab/gcasas1972")		;
	}

	@After
	public void tearDown() throws Exception {
		aluVacio	 			= null;
		aluConCodigo 			= null;
		aluConNombre 			= null;
		aluConNombreYapellido 	= null;	
		aluconEstudio 			= null;
		aluConNombreEstudiosLink =null;

		
	}
	@Test
	public void testNombreYapellido(){
		StringBuilder sb = new StringBuilder("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit");
		sb.append(" from alumnos");
		sb.append( " where alu_nombre like '%Gabriel%'");
		sb.append(" and alu_apellido like '%Casas%'");
		assertEquals(sb.toString(), SelectStrategy.getSql(aluConNombreYapellido));
		
	}
	@Test
	public void testNombre(){
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_nombre like '%Gabriel%'",
				SelectStrategy.getSql(aluConNombre));
	}
	@Test
	public void testGetSqlVacio(){
		 assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos",
				 SelectStrategy.getSql(aluVacio));
	}
	@Test
	public void testGetSqlNull(){
		 assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos",
				 SelectStrategy.getSql(null));
	}

	@Test
	public void testGetSqlConCodigo() {
		assertEquals("select alu_id, alu_nombre, alu_apellido, alu_estudios, alu_linkgit from alumnos where alu_id=10",
					SelectStrategy.getSql(aluConCodigo));
	}

}
