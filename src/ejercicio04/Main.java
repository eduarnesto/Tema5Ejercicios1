package ejercicio04;

public class Main {

	public static void main(String[] args) {
		//Creo difrentes productos
		Articulo art1 = new Articulo ("Campana", 100, 5);
		Articulo art2 = new Articulo ("Manzana", 100, 5);
		Articulo art3 = new Articulo ("Tila", 100, 5);
		
		//Pruebo la funcion para que devuleva el precio
		System.out.println(art1.getPVP());
		
		//Pruebo la funcion para que devuelvo el precio con descuento
		System.out.println(art2.getPVPDescuento(20));
		
		//Vendo un producto del articulo 3
		if (art3.vender()) {
			System.out.println("Has comprado " + art3.getNombre() + " exitosamente");
		} else {
			System.out.println("No hay articulos disponibles de " + art3.getNombre());
		}
		
		//Repongo articulo 3
		System.out.println("Teniamos " + art3.getCuantosQuedan() + " unidades de " + art3.getNombre());
		System.out.println("Repongo 5 articulos");
		art3.almacenar(5);
		System.out.println("Ahora hay " + art3.getCuantosQuedan() + " unidades de " + art3.getNombre());

	}

}
