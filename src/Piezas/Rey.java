package Piezas;

public class Rey  extends Piezas{
	public Rey(String pieza, String color) {
		super(pieza, color);
	}
	
	public int moveX(int x) {
		this.setPosicionX(x);
		return getPosicionX();
	}
	
	public int moveY(int y) {
		this.setPosicionY(y);
		return getPosicionY();
	}

}
