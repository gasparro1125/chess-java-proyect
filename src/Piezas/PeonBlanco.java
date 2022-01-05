package Piezas;

import java.util.ArrayList;

public class PeonBlanco extends Piezas {
	
	public PeonBlanco(String pieza, String color) {
		super(pieza,color);
	}
	
	
	
	public static boolean obstaculos(Piezas selecionada ,int x, int y, boolean [][] vacias) {
		ArrayList<Boolean> checks = new ArrayList<Boolean>();
		boolean check = true;
		int obsta = 0;

		if (x == selecionada.getPosicionX() - 1) {
			for (int i = x; i > selecionada.getPosicionX(); i--) {
				if (vacias[x][y] == true) {
					check = false;
					return check;
				}
				return check;
			}
		} else {
			for (int i = x; i > selecionada.getPosicionX(); i--) {
				if (vacias[i][y] == true)
					checks.add(false);
				else
					checks.add(true);
			}
		}

		for (Boolean boolean1 : checks) {
			if (boolean1 == true)
				obsta++;
		}

		if (obsta == 0)
			check = false;

		System.out.println( "hay obstaculo = " +check);
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
	
	public boolean  isNotFriend(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas ) {
		Piezas objective = recorrerPiezas(x, y, piezas);
		if(objective == null ) return true;
		else if(objective.getColor()==selectionada.getColor()) return false;
		else return true;
	}
	

	public boolean exixtVictim(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
		boolean check = false;
		Piezas objective = recorrerPiezas(x, y, piezas);
		
		if( objective==null) return check;
		else if(objective.getColor()!= selectionada.getColor()) check = true;
		
		
		System.out.println("hay vitima = " +check);
		return check;
		
	}
	
	public boolean ataque(Piezas selectionada,int x, int y){
		boolean check = false;
		
		if(selectionada.getPosicionX()+1==x && selectionada.getPosicionY()-1==y) check = true;
		else if(selectionada.getPosicionX()+1==x && selectionada.getPosicionY()+1==y) check = true;
		
		System.out.println("ataque = " + check);
		return check;
		
	}
	
	public boolean ataquePeon(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
		if(exixtVictim(selectionada, x, y, piezas) == true && ataque(selectionada, x, y)== true) return true;
		else return false;
	}
	
	
	
	
	public Boolean move(Piezas selectionada,int x, int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas,boolean[][] vacias) {
		boolean check = false;
		boolean ataque =  ataquePeon(selectionada, x, y,piezas);
		
		
		if(x<=7 && x>=0 && y<=7 && y>=0) {
			if( isNotFriend(selectionada, x, y, piezas)==true && ataque==true)check = true; 
			
			else if( isNotFriend(selectionada, x, y, piezas)==true && ataque==false){
				if(obstaculos(selectionada, x, y, vacias)==false && ataque==false) {
				if(this.getPosicionX()==1 && x ==2 && this.getPosicionY()==y) check= true;
					else if(this.getPosicionX()==1 && x ==3 && this.getPosicionY()==y) check= true;
					else if(this.getPosicionX()>=2 && x==this.getPosicionX()+1 && this.getPosicionY()==y) check= true;
					else return check;
				}else return check;
			}else return check;
		}
		else return check;
		
		return check;
	}
}
