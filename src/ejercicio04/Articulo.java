package ejercicio04;

public class Articulo {
	private String nombre = "";
	private float precio;
	private final int IVA = 21;
	private int cuantosQuedan;
	
	public Articulo(String nombre, float precio, int cuantosQuedan) {
		super();
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
		if (precio > 0)
			this.precio = precio;
		if (cuantosQuedan>=0)
			this.cuantosQuedan = cuantosQuedan;
	}
	
	public void imprime() {
		System.out.println("");
	}
	
	
}
