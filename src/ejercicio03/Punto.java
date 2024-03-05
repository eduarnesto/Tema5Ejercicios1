package ejercicio03;

public class Punto {
	private int x;
	private int y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void imprime() {
		System.out.println(x + ", " + y);
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	public float distancia(Punto c) {
		return (float) Math.sqrt(Math.pow(c.x - this.x, 2) + (Math.pow(c.y - this.y, 2)));
	}
}