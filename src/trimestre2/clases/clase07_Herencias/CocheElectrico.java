package trimestre2.clases.clase07_Herencias;

public class CocheElectrico extends Coche{

	//atributos solo del hijo
	private double voltaje;
	
	//herencia de atributos del padre
	public CocheElectrico(int numRuedas, 
			int numPuertas, String modelo, 
			int numVentanas, int numAsientos,
			int velocidadMax,double voltaje) {
		
		// voltaje no se pasa al super, al ser atributo propio
		super(numRuedas, numPuertas, modelo, 
				numVentanas, numAsientos, velocidadMax);
		
		//En el super, si bien no puedes quitar un atributo, puedes por ejemplo ponerlo a 0
		
		this.voltaje = voltaje;
		
	}
		
		// En java no se puede tener herencia múltiple, en python si (heredar de dos "padres" a la vez)
	
	
		// Para q se despliegue el votraje (atributo exclusivo del coche electrico:
	
		//Copio cabecera
	
		@Override
		public void mostrarInfo() {
			super.mostrarInfo();
			System.out.println("\tInfo particular del coche\n"
					+ "\t\t Voltaje: " + this.voltaje);
	
	}
		
		/* No se podría, al ser clase privada; PERO si en protected 
		 * (visible para si mismo y las clases del mismo paquete (incluido herencias). 
		 * Ni siquiera hay q usar super (a no ser q haya un private int dentro de cocheelectrico
		 * con el mismo nombre). This para el suyo propio, super para la del padre*/
		
		
		public void sumarPuertasYVentanas() {
			System.out.println("Número de puertas y ventanas: " + (numPuertas + numVentanas));
		}
	
}
