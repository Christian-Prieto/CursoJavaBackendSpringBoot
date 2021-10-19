package es.com.inetum.elementos.modelo;

public class Tijera extends ElementoFactory {
	public Tijera() {
		super("tijera", 2);
	
	}

	@Override
	public int comparar(ElementoFactory pElem) {
		int numero = pElem.getNumero();
	    int resultado =0;

	    if(numero == PAPEL) {
	    	resultado =1;
	    	descripcionResultado = "tijera le ganó a papel";
	    }
	    	
	    else if (numero ==  PIEDRA) {
	    	resultado = -1;
	    	descripcionResultado = "tiera perdi´con piedra";
	    }
	    	
	    else {
	    	resultado = 0;
	    	descripcionResultado = "EMPATE";
	    }
	    	
	    
		return resultado;
	}


}
