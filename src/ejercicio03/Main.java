package ejercicio03;

public class Main {

	public static void main(String[] args) {
		//Creo un objeto
		Punto a = new Punto (2, 5);
		
		//Creo un objeto
		Punto b = new Punto (2, 5);
		
		//Cambio la posicion del objeto b
		b.setXY(3, 1);
		
		//Muevo la posicion del objeto a
		a.desplaza(1, 0);
		
		//Calculo la distancia entre los dos objetos
		System.out.println(a.distancia(b));

	}

}
