package Piezas;

import java.awt.Checkbox;

class PeonNegro  extends Piezas{

	public PeonNegro(String pieza, String color) {
		super(pieza, color);
	}
	
	public Boolean move(int x, int y) {
		boolean check = false;
		if(x<=7 && x>=0 && y<=7 && y>=0) {
			if(this.getPosicionX()==6 && x ==5 && this.getPosicionY()==y) check= true;
			else if(this.getPosicionX()==6 && x ==4 && this.getPosicionY()==y) check= true;
			else if(this.getPosicionX()<=5 && x==this.getPosicionX()-1 && this.getPosicionY()==y) check= true;
			else return check;
		}
		else return check;
		
		return check;
	}
	
}
