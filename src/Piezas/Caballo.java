package Piezas;

public class Caballo extends Piezas{
	public Caballo(String pieza, String color) {
		super(pieza, color);
	}
	
public Boolean move(int x, int y) {
		
	boolean check = false;
	if(x<=7 && x>=0 && y<=7 && y>=0) {
		
		if(x==this.getPosicionX()-2 && y==this.getPosicionY()-1) check = true;
		else if(x==this.getPosicionX()-2 && y==this.getPosicionY()+1) check = true;
		else if(x==this.getPosicionX()-1 && y==this.getPosicionY()-2) check = true;
		else if(x==this.getPosicionX()-1 && y==this.getPosicionY()+2) check = true;
		else if(x==this.getPosicionX()+1 && y==this.getPosicionY()-2) check = true;
		else if(x==this.getPosicionX()+1 && y==this.getPosicionY()+2) check = true;
		else if(x==this.getPosicionX()+2 && y==this.getPosicionY()-1) check = true;
		else if(x==this.getPosicionX()+2 && y==this.getPosicionY()+1) check = true;
		else return check;
	}
	else return check;
	return check;		
	}
}
