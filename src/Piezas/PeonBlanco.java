package Piezas;

public class PeonBlanco extends Piezas {
	public PeonBlanco(String pieza, String color) {
		super(pieza,color);
	}
	
	public Boolean move(int x, int y) {
		boolean check = false;
		if(x<=7 && x>=0 && y<=7 && y>=0) {
			if(this.getPosicionX()==1 && x ==2 && this.getPosicionY()==y) check= true;
			else if(this.getPosicionX()==1 && x ==3 && this.getPosicionY()==y) check= true;
			else if(this.getPosicionX()>=2 && x==this.getPosicionX()+1 && this.getPosicionY()==y) check= true;
			else return check;
		}
		else return check;
		
		return check;
	}
}
