package com.domain.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import es.com.inetum.elementos.modelo.Model;



public interface DAO {
	//responde a un patron de diseño DAO
	//CRUD. ABMC
	public void agregar(Model pMod) throws ClassNotFoundException, SQLException;
	public void modificar(Model pMod)throws ClassNotFoundException, SQLException;
	public void eliminar(Model pMod)throws ClassNotFoundException, SQLException;
	public List<Model> leer(Model pMod)throws ClassNotFoundException, SQLException;
	

}
