package ejercicio01;

public class Main {

	public static void main(String[] args) {
		//Creo un objeto nuevo
		CuentaCorriente p1 = new CuentaCorriente ("dni", "Pepe", 1234);

		//Llamo a las funciones
		p1.ingresarDinero(1000);
		System.out.println(p1.saldo);
		
		//Llamo a las funciones
		p1.sacarDinero(1000);
		System.out.println(p1.saldo);
		
		//Llamo a las funciones
		p1.muestraInfo();
	}

}
