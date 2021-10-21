package com.domain.modelo.dao.selectStrategy;

public class NullStrategy extends SelectStrategy {

	public NullStrategy() {
		this.isUltimo 	= false;
		this.tengoWhere = false;
	}

	@Override
	public String getCondicion() {		
		return "";
	}

	@Override
	public boolean isMe() {
		this.isUltimo = this.alumno == null;
		return this.alumno == null;		
	}

}
