package ejercicio01;

/**
 * Una clase para deifinir una cuenta corriente
 * @author earnesto
 */
public class CuentaCorriente {
	/**
	 * String que guarda el dni
	 */
	String dni;
	
	/**
	 * String que guarda el nombre
	 */
	String nombre;
	
	/**
	 * Double para guardar 
	 */
	double saldo;

	public CuentaCorriente(String dni, double saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}

	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();
		this.dni = dni;
		if (nombre != null)
			this.nombre = nombre;
		this.saldo = saldo;
	}

	public void sacarDinero(double retiro) {
		if (this.saldo >= retiro) {
			this.saldo -= retiro;
		}
	}

	public void ingresarDinero(double entrada) {
		this.saldo += entrada;
	}
	
	public void muestraInfo () {
		System.out.println("DNI: " + this.dni);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Saldo: " + this.saldo);
	}
}
