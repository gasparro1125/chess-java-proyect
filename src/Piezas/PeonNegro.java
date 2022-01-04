package Piezas;

import java.util.ArrayList;


class PeonNegro  extends Piezas{

	public PeonNegro(String pieza, String color) {
		super(pieza, color);
	}
	
	
	public static boolean obstaculos(Piezas selecionada ,int x, int y, boolean [][] vacias) {
		boolean check = true;
		
		for(int i = x; selecionada.getPosicionX()>i;i++ ) {
			if(vacias[x][y]== true) {
				check = false;
				return check;
			}
			return check;
		}
		return check;
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
	
	public boolean isNotFriend(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas ) {
		Piezas objective = recorrerPiezas(x, y, piezas);
		if(objective== null)return true;
		else if(objective.getColor()==selectionada.getColor()) return false;
		else return true;
	}
	
	
	
	public boolean exixtVictim(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
		boolean check = false;
		Piezas objective = recorrerPiezas(x, y, piezas);
		
		if( objective==null) return check;
		else if(objective.getColor()!= selectionada.getColor()) check = true;
		
		return check;
		
	}
	
	public boolean ataque(Piezas selectionada,int x, int y){
		boolean check = false;
		
		if(selectionada.getPosicionX()-1==x && selectionada.getPosicionY()-1==y) check = true;
		else if(selectionada.getPosicionX()-1==x && selectionada.getPosicionY()+1==y) check = true;
		
		System.out.println("ataque = " + check);
		return check;
		
	}
	
	public boolean ataquePeon(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
		if(exixtVictim(selectionada, x, y, piezas) == true && ataque(selectionada, x, y)== true) return true;
		else return false;
	}
	
	
	
	public Boolean move(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas, boolean[][] vacias) {
		boolean check = false;
		boolean ataque =  ataquePeon(selectionada, x, y,piezas);
		
		if(x<=7 && x>=0 && y<=7 && y>=0) {
			if( isNotFriend(selectionada, x, y, piezas)==true && ataque==true)check = true; 
			
			else if( isNotFriend(selectionada, x, y, piezas)==true && ataque==false){
				if(obstaculos(selectionada, x, y, vacias)==false && ataque==false) {
					if(this.getPosicionX()==6 && x ==5 && this.getPosicionY()==y) check= true;
					else if(this.getPosicionX()==6 && x ==4 && this.getPosicionY()==y) check= true;
					else if(this.getPosicionX()<=5 && x==this.getPosicionX()-1 && this.getPosicionY()==y) check= true;
					else return check;
				}else return check;
			}else return check;
		}
		else return check;
		
		return check;
	}
	
}
