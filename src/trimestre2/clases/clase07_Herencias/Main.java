package trimestre2.clases.clase07_Herencias;

public class Main {
	public static void main(String[] args) {
		Coche c = new Coche(4, 4, "Skoda", 4, 4, 280);
		CocheElectrico ce = new CocheElectrico(4, 4, "Skoda", 4, 4, 280, 420.2);

		c.mostrarInfo();
		System.out.println();
		ce.mostrarInfo();
		/*
		 * Con la herencia, no tengo q escribir varias veces la misma función la función
		 * mostrar info ya está representada);
		 */

		System.out.println();
		ce.sumarPuertasYVentanas();
		System.out.println(("\n\n"));

		mostrarInfoCoche(c);
		System.out.println();
		mostrarInfoCoche(ce);

	}

	/* Al ser coche eléctrico un tipo decoche funciona, pero solo para cosas muy cocnretas 
	 * (polimorfismo) 
	 * Por ejemplo si uno fuera entero y otro String
	 * Tampoco podría poner c.voltaje, ya que coche no lo tiene */
	public static void mostrarInfoCoche(Coche c) {
		c.mostrarInfo();

	}

}

//Encapsulamiento, abstracción, herencia, polimorfismo