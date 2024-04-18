package main;

import model.Hulk;

public class ExamenUF4 {

	public static void main(String[] args) {
	
		// Creamos una clase de tipo Hulk y pasamos false al parametro boolean del constructor.	
		Hulk cosaVerde = new Hulk();
		
		// Calculamos el potencial sin multiplicarse X2 (boolean false).
		System.out.println("Potencial de Hulk sin enfurecer: " + cosaVerde.calcularPotencial());

		// El metodo transformar() nos convierte el boolean a true.
		System.out.println("!Hulk ha entrado en furia!");
		cosaVerde.transformar();
		System.out.println("Furia: " + cosaVerde.isFuria());
		
		// Accedemos al getter del nombre.
		System.out.println("Nombre: " + cosaVerde.getNombre());
		System.out.println("Edad: " + cosaVerde.getEdad());
		System.out.println("");
		
		// Accedemos al metodo que nos imprime los poderes.
		System.out.println("Lista de poderes: ");
		cosaVerde.showPoderes();
		
		System.out.println("");
		
		// Calculamos el potencial multiplicando X2 (boolean true).
		System.out.println("Potencial de Hulk enfurecido: " + cosaVerde.calcularPotencial());
		
		// El metodo restaurar() nos convierte el boolean a false.
		System.out.println("¡Hulk a vuelto a la normalidad!");
		cosaVerde.restaurar();
		System.out.println("Furia: " + cosaVerde.isFuria());
	
	}


}
