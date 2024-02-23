package ejercicio02;

public class Libro {
	String titulo;
	String autor;
	int ejemplares;
	int ejemplaresPrestados;
	
	public Libro(String titulo, String autor, int ejemplares, int ejemplaresPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public Libro() {
		super();
	}
	
	public boolean prestamo () {
		boolean prestado=false;
		int ejemplaresDisponibles = this.ejemplares - this.ejemplaresPrestados;
		
		if (ejemplaresDisponibles>0) {
			prestado=true;
			this.ejemplaresPrestados++;
		}
		
		return prestado;
	}
	
	public boolean devolucion () {
		boolean devuelto=false;
		
		if (this.ejemplaresPrestados>0) {
			prestado=true;
			this.ejemplaresPrestados++;
		}
		
		return prestado;
	}
}
