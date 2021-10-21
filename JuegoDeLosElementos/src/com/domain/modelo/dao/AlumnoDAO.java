package com.domain.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import es.com.inetum.elementos.*;
import es.com.inetum.elementos.controlador.ConectorBBDDMySql;
import es.com.inetum.elementos.modelo.Alumno;
import es.com.inetum.elementos.modelo.Model;

import com.domain.modelo.dao.selectStrategy.SelectStrategy;


public class AlumnoDAO implements DAO {
	private Connection conexion;
	public AlumnoDAO() {
		
	}

	public void agregar(Model pMod) throws ClassNotFoundException, SQLException {
		Alumno alumno= (Alumno)pMod;
		
		//1- me tengo que conectar
		ConectorBBDDMySql.conectar();
		conexion = ConectorBBDDMySql.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("INSERT INTO alumnos (ALU_NOMBRE,ALU_APELLIDO,ALU_ESTUDIOS,ALU_LINKGIT) VALUES");
		sql.append("(?,?,?,?)");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setString(1, alumno.getNombre());
		pstm.setString(2, alumno.getApellido());
		pstm.setString(3, alumno.getEstudios());
		pstm.setString(4, alumno.getLinkArepositorio());
		
		pstm.executeUpdate();				
		ConectorBBDDMySql.desConectar();
	}

	public void modificar(Model pMod) throws ClassNotFoundException, SQLException {
		Alumno alumno= (Alumno)pMod;
		
		//1- me tengo que conectar
		ConectorBBDDMySql.conectar();
		conexion = ConectorBBDDMySql.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("update alumnos");
		sql.append(" set ALU_NOMBRE=? ,ALU_APELLIDO=?,ALU_ESTUDIOS=?,ALU_LINKGIT=?");
		sql.append(" where alu_id=?");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setString(1, alumno.getNombre());
		pstm.setString(2, alumno.getApellido());
		pstm.setString(3, alumno.getEstudios());
		pstm.setString(4, alumno.getLinkArepositorio());
		pstm.setInt(5, alumno.getCodigo());
		
		pstm.executeUpdate();				
		ConectorBBDDMySql.desConectar();
		

	}

	public void eliminar(Model pMod) throws ClassNotFoundException, SQLException {
		Alumno alumno= (Alumno)pMod;
		
		//1- me tengo que conectar
		ConectorBBDDMySql.conectar();
		conexion = ConectorBBDDMySql.getConection();
		//2- statemente
		
		StringBuilder sql = new StringBuilder("delete from alumnos");		
		sql.append(" where alu_id=?");
		
		PreparedStatement pstm = conexion.prepareStatement(sql.toString());
		pstm.setInt(1, alumno.getCodigo());
		
		pstm.executeUpdate();				
		ConectorBBDDMySql.desConectar();	

	}

	public List<Model> leer(Model pMod) throws ClassNotFoundException, SQLException {
		Alumno alumno= (Alumno)pMod;
		List<Model> alumnos = new ArrayList<Model>();
		
//		//1- me tengo que conectar
		ConectorBBDDMySql.conectar();
		conexion = ConectorBBDDMySql.getConection();
//		//2- statemente
		
//		StringBuilder sql = new StringBuilder("SELECT ALU_ID,ALU_NOMBRE,ALU_APELLIDO,ALU_ESTUDIOS,ALU_LINKGIT");
//		sql.append(" from alumnos");
//		//utilizar patron strategy
//		if(alumno.getCodigo()>0)
//			sql.append(" where alu_id=?");
//		//esto lo voy a hacer para probar.
		

		String sql =SelectStrategy.getSql(alumno);
		Statement stm = conexion.createStatement();
//		pstm.setInt(1, alumno.getCodigo());
		
		ResultSet rs =stm.executeQuery(sql);				
		
		
		while(rs.next()){
			alumnos.add(new Alumno(	rs.getInt("ALU_ID")			,
									rs.getString("ALU_NOMBRE") 	,
									rs.getString("ALU_APELLIDO"),
									rs.getString("ALU_ESTUDIOS"), 
									rs.getString("ALU_LINKGIT")));		
		}
		rs.close();
		ConectorBBDDMySql.desConectar();
		
		return  alumnos;
	}

}
