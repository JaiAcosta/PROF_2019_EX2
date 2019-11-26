package es.upm.examen;

public class EntradaInvalida extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntradaInvalida (){
		System.err.println("Introducida entrada inválida.");
	}
	
}
