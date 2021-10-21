package com.domain.modelo.dao.selectStrategy;

public class ApellidoStrategy extends SelectStrategy {

	public ApellidoStrategy() {		
	}

	@Override
	public String getCondicion() {
		StringBuilder sb = new StringBuilder();
		if(tengoWhere){
			sb.append(" and alu_apellido like '%");
			sb.append(alumno.getApellido());
			sb.append("%'");
		}else {
			sb.append("where alu_apellido like '%");
			sb.append(alumno.getApellido());
			sb.append("%'");
			tengoWhere = true;			
		}			
		return sb.toString();
	}

	@Override
	public boolean isMe() {		
		return alumno.getApellido()!=null	&&
				!alumno.getApellido().isEmpty();
	}

}
