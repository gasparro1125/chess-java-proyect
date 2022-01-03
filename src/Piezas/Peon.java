package Piezas;


class Peon  extends Piezas{

	public Peon(String pieza, String color) {
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
