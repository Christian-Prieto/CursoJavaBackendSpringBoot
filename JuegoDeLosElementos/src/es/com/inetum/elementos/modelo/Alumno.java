package es.com.inetum.elementos.modelo;

import java.util.List;

public class Alumno implements Model , Vaciable{
	private int 	codigo						;
	private String 	nombre						;	
	private String 	apellido					;
	private String 	estudios					;
	private String  linkArepositorio			;
	private List<PracticaResuelta> practicasResueltas	;
	
	//Vacio
	public Alumno() {}

	public Alumno(int codigo, String nombre, String apellido, String estudios, String linkArepositorio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estudios = estudios;
		this.linkArepositorio = linkArepositorio;
	}

	public Alumno(int pCod) {
		codigo = pCod;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getLinkArepositorio() {
		return linkArepositorio;
	}

	public void setLinkArepositorio(String linkArepositorio) {
		this.linkArepositorio = linkArepositorio;
	}

	public List<PracticaResuelta> getPracticasResueltas() {
		return practicasResueltas;
	}

	public void setPracticasResueltas(List<PracticaResuelta> practicasResueltas) {
		this.practicasResueltas = practicasResueltas;
	}
	
	public boolean equals(Object obj){
		return obj instanceof Alumno 						&&
				((Alumno)obj).getNombre().equals(nombre)    &&
				((Alumno)obj).getApellido().equals(apellido);
	}
	public int hashCode(){
		return nombre.hashCode() + apellido.hashCode();
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder("codigo=");
		sb.append(this.codigo);
		sb.append(", nombre=");
		sb.append(this.nombre);
		sb.append(", apllido=");
		sb.append(this.apellido);
		sb.append(", estudios=");
		sb.append(this.estudios);
		sb.append(",linkArepositoio=");
		sb.append(this.linkArepositorio);
		sb.append(", practicasResueltas=");
		sb.append(this.practicasResueltas);		
		return sb.toString();
	}

	public boolean isEmpty() {		
		return codigo 				==0 	&&
				nombre 				==null 	&&
				apellido 			== null &&
				estudios 			== null &&
				linkArepositorio 	==null  &&
				practicasResueltas 	==null;
	}
	

}
