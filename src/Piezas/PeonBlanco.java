package Piezas;

import java.util.ArrayList;

public class PeonBlanco extends Piezas {
	public PeonBlanco(String pieza, String color) {
		super(pieza,color);
	}
	public Piezas recorrerPiezas( int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas ) {
		Piezas check = null;
		for (int i = 0; i<2;i++) {
			for (int j = 0; j<6;j++) {
				for (Integer l = 0; l < piezas.get(i).get(j).size(); l++) {
					if(piezas.get(i).get(j).get(l).getPosicionX()==x && piezas.get(i).get(j).get(l).getPosicionY()==y) {
						check=piezas.get(i).get(j).get(l);
					}
				}
			}
		}
		return check;
	}
	
	public boolean  isNotFriend(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas ) {
		Piezas objective = recorrerPiezas(x, y, piezas);
		if(objective == null ) return true;
		else if(objective.getColor()==selectionada.getColor()) return false;
		else return true;
	}
	
	public Boolean move(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas,boolean[][] vacias) {
		boolean check = false;
		if(x<=7 && x>=0 && y<=7 && y>=0) {
			if( isNotFriend(selectionada, x, y, piezas)==true) {
				if(this.getPosicionX()==1 && x ==2 && this.getPosicionY()==y) check= true;
				else if(this.getPosicionX()==1 && x ==3 && this.getPosicionY()==y) check= true;
				else if(this.getPosicionX()>=2 && x==this.getPosicionX()+1 && this.getPosicionY()==y) check= true;
				else return check;
			}else return check;
		}
		else return check;
		
		return check;
	}
}