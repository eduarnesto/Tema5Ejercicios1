package ejercicio02;

public class Main {

	public static void main(String[] args) {
		//Creo un obejeto nuevo
		Libro libro = new Libro ("La Campana", "Hector", 20, 0);
		
		//Presto un libro
		if (libro.prestamo()) {
			System.out.println("Se ha prestado un libro");
		} else {
			System.out.println("No se ha podido prestar el libro");
		}
		
		//Devuelvo un libro
		if (libro.devolucion()) {
			System.out.println("Se ha devuelto un libro");
		} else {
			System.out.println("No se ha podido devolver el libro");
		}

	}

}
