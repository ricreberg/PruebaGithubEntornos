package trimestre2.clases.clase05;

public class Main {
	public static void main(String[] args) {
		LinkedListImplementacion l = new LinkedListImplementacion();
		
		// --- Código antiguo ---
		l.add(0);
		l.add(1);
		l.add(234234);
		l.add(123);

		System.out.println("Lista inicial:");
		l.print();
		
		// --- NUEVOS AÑADIDOS PARA PROBAR ---

		// 1. Eliminar por índice (el del medio)
		// Borraremos el "234234" que está en la posición 2
		System.out.println("\nEliminando el índice 2 (valor 234234):");
		l.eliminarPorIndice(2);
		l.print();

		// 2. Eliminar por valor
		// Buscamos el número 123 y lo borramos
		System.out.println("\nEliminando el valor 123:");
		l.eliminarPorValor(123);
		l.print();

		// 3. Eliminar el primero (índice 0)
		// Esto prueba el método interno borrarNodoPrimeroSeg
		System.out.println("\nEliminando el primer elemento (índice 0):");
		l.eliminarPorIndice(0);
		l.print();
        
        // 4. Intentar borrar algo que no existe
        System.out.println("\nIntentando borrar índice inexistente (50):");
        boolean resultado = l.eliminarPorIndice(50);
        System.out.println("¿Se pudo borrar? " + resultado);
	}
}