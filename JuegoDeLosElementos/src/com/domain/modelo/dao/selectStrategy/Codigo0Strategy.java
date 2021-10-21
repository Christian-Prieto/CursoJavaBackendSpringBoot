package com.domain.modelo.dao.selectStrategy;

public class Codigo0Strategy extends SelectStrategy{

	public Codigo0Strategy() {		
	}

	@Override
	public String getCondicion() {
		StringBuilder sb = new StringBuilder(" where alu_id=");
		sb.append(alumno.getCodigo());
		return sb.toString();
	}

	@Override
	public boolean isMe() {		
		isUltimo = alumno.getCodigo()>0;
		return alumno.getCodigo()>0;
	}

}
