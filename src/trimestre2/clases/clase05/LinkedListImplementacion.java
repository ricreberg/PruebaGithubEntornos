package trimestre2.clases.clase05;

/* Listas de elementos que mantengan su orden de inserción, 
 * aunque los desordenemos o insertemos entre medias. 
 * Además es más rapido que hacerlo mediante índices */

//En las clases privadas no se pone private

class Nodo {
	int valor;
	Nodo siguiente;

	Nodo(int valor) {
		this.valor = valor;
		siguiente = null;
	}
}

public class LinkedListImplementacion {
	private Nodo primero;
	private int numNodos; // Añadido del segundo código

	LinkedListImplementacion() {
		primero = null;
		numNodos = 0;
	}

	public void add(int valor) {
		Nodo n = new Nodo(valor);
		numNodos++; // Actualizamos el contador

		if (primero == null) {
			primero = n;
			n.siguiente = primero;
			return;
			
		} // no hace falta poner el else
		
		Nodo actual = primero;
		n.siguiente = primero;

		while (actual.siguiente != primero) {
			actual = actual.siguiente;
		}
		actual.siguiente = n;
	}

	public void print() {
		if (primero == null) {
			System.out.println("Lista vacía");
			return;
		}
		
		Nodo actual = primero;
		int contador = 1;
		
		while (contador != 0) {
			System.out.print(actual.valor + " --> ");
			actual = actual.siguiente;
			if (actual == primero) {
				contador--;
			}
		}
		System.out.println(actual.valor);
	}

	// --- Nuevos métodos integrados ---

	public boolean eliminarPorIndice(int indice) {
		if (indice < 0 || indice >= numNodos) {
			return false;
		}
		
		Nodo actual = primero;
		int contador = 0;
		Nodo nBorrar = null;
		
		while (true) {
			if (indice == contador) {
				nBorrar = actual;
				break;
			}
			actual = actual.siguiente;
			contador++;
		}
		
		if (indice == 0) {
			borrarNodoPrimeroSeg();
		} else {
			borrar(nBorrar);
		}
		return true;
	}

	private void borrarNodoPrimeroSeg() {
		if (numNodos == 1) {
			primero = null;
		} else {
			Nodo ultimo = buscarAnterior(primero);
			primero = primero.siguiente;
			ultimo.siguiente = primero;
		}
		numNodos--;
	}

	// se llama lectura adelantada
	public boolean eliminarPorValor(int elementoABorrar) {
		if (primero == null) return false;

		if (primero.valor == elementoABorrar) {
			borrarNodoPrimeroSeg();
			return true;
		}
		
		Nodo actual = primero.siguiente;
		while (actual != primero) {
			if (actual.valor == elementoABorrar) {
				borrar(actual);
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}

	// trozos de codigo de complementacion es normal que sea privada
	private void borrar(Nodo nBorrar) {
		Nodo anterior = buscarAnterior(nBorrar);
		anterior.siguiente = nBorrar.siguiente;
		nBorrar = null; // trashrecolector
		numNodos--;
	}

	private Nodo buscarAnterior(Nodo nBorrar) {
		Nodo actual = primero;
		// Corregido: comparamos con actual.siguiente
		while (actual.siguiente != nBorrar) {
			actual = actual.siguiente;
		}
		return actual;
	}
}