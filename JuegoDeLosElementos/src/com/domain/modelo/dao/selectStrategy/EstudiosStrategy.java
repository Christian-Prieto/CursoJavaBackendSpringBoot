package com.domain.modelo.dao.selectStrategy;

public class EstudiosStrategy extends SelectStrategy {

	public EstudiosStrategy() {	}

	@Override
	public String getCondicion() {
		StringBuilder sb = new StringBuilder();
		if(tengoWhere){
			sb.append(" and alu_estudios like '%");
			sb.append(alumno.getEstudios());
			sb.append("%'");			
		}
		else {
			sb.append(" where alu_estudios like '%");
			sb.append(alumno.getEstudios());
			sb.append("%'");
			tengoWhere=true;			
		}
		return sb.toString();
	}

	@Override
	public boolean isMe() {		
		return 	alumno.getEstudios()!=null &&
				!alumno.getEstudios().isEmpty();
	}

}
