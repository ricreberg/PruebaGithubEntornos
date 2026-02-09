package trimestre2.clases.clase07_Herencias;

public class Coche {
	private int numRuedas;
	protected int numPuertas;
	private String modelo;
	protected int numVentanas;
	private int numAsientos;
	private int velocidadMax;

	public Coche(int numRuedas, int numPuertas, String modelo, 
			int numVentanas, int numAsientos, int velocidadMax) {
		this.numRuedas = numRuedas;
		this.numPuertas = numPuertas;
		this.modelo = modelo;
		this.numVentanas = numVentanas;
		this.numAsientos = numAsientos;
		this.velocidadMax = velocidadMax;
	}


	public void mostrarInfo() {
		System.out.println("Info general del coche \n" 
				+ "\t NumRuedas: " + this.numRuedas + "\n"
				+ "\t NumPuertas: " + this.numPuertas + "\n"
				+ "\t modelo: " + this.modelo + "\n"
				+ "\t NumVentanas: " + this.numVentanas + "\n"
				+ "\t NumAsientos: " + this.numAsientos + "\n"
				+ "\t velocidadMax: " + this.velocidadMax + "\n");
		//nu  evo cambio
	} 




}
