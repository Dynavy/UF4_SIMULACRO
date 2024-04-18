package model;

public abstract class SuperHeroe {

	// Declarar variables.
	protected String nombre;
	protected int edad;
	protected String[] poderes = new String[4];

	
	// Constructor de la clase padre.
	// Tiene como parametros el nombre y la edad e inicializa ambos.
	public SuperHeroe(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}

	// Metodo que es substituido por el @override de la clase Hulk.
	public double calcularPotencial() {

		double totalPotencial = 0.0;
		totalPotencial = edad * 10;

		return totalPotencial;
	}

	// Metodo que recorre todos los poderes.
	public void showPoderes() {
		
		for (String poder : poderes) {
			System.out.println(poder);
		}
	}
	
	// Metodo que sirve para agregar un poder en una posicion especificada.
	public void setPoder(String poder, int posicion) {
		
		if (posicion >= 0 && posicion < poderes.length) {
			poderes[posicion] = poder; 
		}
	}
}
