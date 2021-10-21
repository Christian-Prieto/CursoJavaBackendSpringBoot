package es.com.inetum.elementos.modelo;

public class PracticaResuelta implements Model {
	private int codigo;
	private float nota;
	private String observaciones;
	
	public PracticaResuelta() {}

	public PracticaResuelta(int codigo, float nota, String observaciones) {
		super();
		this.codigo = codigo;
		this.nota = nota;
		this.observaciones = observaciones;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
//TODO para los alumnos equals hashcode to String
	
}
