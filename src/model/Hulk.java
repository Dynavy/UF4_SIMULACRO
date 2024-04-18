package model;
import main.Mutable;

public class Hulk extends SuperHeroe implements Mutable {

	// Declarar variables:
	private boolean furia = false;
	
	
	// Param: boolean de la class Hulk.
	// Inicialize: todos los atributos de la clase Hulk y la clase SuperHeroe.
	// Super: pasamos al constructor de la clase Padre el nombre y la edad.
	public Hulk(boolean furia) {
		super("Hulk", 25);
		this.poderes = new String[]{"fuerte", "alto", "resistente", "irascible"};
		this.furia = furia;
	}
	
	
	// Getter para invocar el nombre en el main.
	public String getNombre() {
		return this.nombre;
	}
	
	// Getter para invocar la furia en el main.
	public boolean isFuria() {
		return furia;
	}
	// Getter para invocar la edad en el main.
	public int getEdad() {
		return edad;
	}

	// Hacemos overriding al metodo de la clase Padre.
	@Override
	public double calcularPotencial() {
		
		// Invocamos mediante super. el metodo de la clase padre y almacenamos el valor en potencia.
		double potenciaBase = super.calcularPotencial();
		double resultadoFinal;
		
		// Si el boolean esta true retornara potencia * 2.
		if (furia)  {
			resultadoFinal = potenciaBase * 2;
			
			return resultadoFinal;
			
		} else {
			
			// Si el boolean esta false retornara la potencia base.
			return potenciaBase;
		}
	}
	
	// Metodo para poner el boolean en true.
	public void transformar() {
		furia = true;
		
	}
	
	// Metodo para poner el boolean en false.
	public void restaurar() {
		furia = false;
	}
	
}
