package Piezas;

public class Torre extends Piezas {
	
	public Torre(String pieza, String color) {
		super(pieza, color);
	}
	
	
	public Boolean move(int x, int y) {
		boolean check = false;
		if(x<=7 && x>=0 && y<=7 && y>=0) {
			
			if(this.getPosicionX()==x || this.getPosicionY()==y) check = true;
			else return check;
		}
		else return check;
		return check;		
	}
}
