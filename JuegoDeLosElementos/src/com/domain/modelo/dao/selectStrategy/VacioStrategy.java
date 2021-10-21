package com.domain.modelo.dao.selectStrategy;

public class VacioStrategy extends SelectStrategy {

	public VacioStrategy() {
		this.isUltimo = false;
		this.tengoWhere =false;
	}

	@Override
	public String getCondicion() {		
		return "";
	}

	@Override
	public boolean isMe() {
		this.isUltimo = alumno.isEmpty();
		return alumno.isEmpty();
	}

}
