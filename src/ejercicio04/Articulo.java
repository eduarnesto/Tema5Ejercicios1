package ejercicio04;

public class Articulo {
	private String nombre = "";
	private float precio;
	public final int IVA = 21;
	private int cuantosQuedan;

	public Articulo(String nombre, float precio, int cuantosQuedan) {
		super();
		setNombre(nombre);
		setPrecio(precio);
		setCuantosQuedan(cuantosQuedan);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals(""))
			this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if (precio > 0)
			this.precio = precio;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0)
			this.cuantosQuedan = cuantosQuedan;
	}
	
	@Override
	public String toString() {
		String info = "";

		info = "Articulo: " + this.nombre + "\n" + "Precio sin IVA: " + this.precio + "\n" + "Disponibles: "
				+ this.cuantosQuedan;

		return info;
	}

	public float getPVP() {
		float precio;

		precio = this.precio * (1 + (float) this.IVA / 100);

		return precio;
	}

	public float getPVPDescuento(int descuento) {
		float precio;

		precio = this.precio * (1 + (float) this.IVA / 100) * (1 - (float) descuento / 100);

		return precio;
	}

	public boolean vender() {
		boolean vendido = false;

		if (this.cuantosQuedan > 0) {
			this.cuantosQuedan--;
			vendido = true;
		}

		return vendido;
	}

	public void almacenar(int cantidad) {

		this.cuantosQuedan += cantidad;

	}

}
