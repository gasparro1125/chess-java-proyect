package Piezas;
import Piezas.Piezas;

import java.util.ArrayList;

public class MountPiezas {
	
	private static Piezas peonBlanco(){
		Piezas PeonBlanco = new Piezas("P","B");
		return PeonBlanco;
	}
	
	private static Piezas torreBlanca(){
		Piezas TorreBlanca = new Piezas("T","B");
		return TorreBlanca;
	}
	
	private static Piezas caballoBlanco(){
		Piezas CaballoBlanco = new Piezas("C","B");
		return CaballoBlanco;
	}

	private static Piezas alfilBlanco(){
		Piezas AlfilBlanco = new Piezas("A","B");
		return AlfilBlanco;
	}
	
	private static Piezas reinaBlanca(){
		Piezas ReinaBlanca = new Piezas("Q","B");
		return ReinaBlanca;
	}
	
	private static Piezas reyBlanco(){
		Piezas ReyBlanco = new Piezas("R","B");
		return ReyBlanco;
	}
	
//*************************************************************************
	
	private static Piezas peonNegro(){
		Piezas PeonNegro = new Piezas("P","N");
		return PeonNegro;
	}
	
	private static Piezas torreNegra(){
		Piezas TorreNegra = new Piezas("T","N");
		return TorreNegra;
	}
	
	private static Piezas caballoNegro(){
		Piezas CaballoNegro = new Piezas("C","N");
		return CaballoNegro;
	}

	private static Piezas alfilNegro(){
		Piezas AlfilNegro = new Piezas("A","N");
		return AlfilNegro;
	}
	
	private static Piezas reinaNegra(){
		Piezas ReinaNegra = new Piezas("Q","N");
		return ReinaNegra;
	}
	
	private static Piezas reyNegro(){
		Piezas ReyNegro = new Piezas("R","N");
		return ReyNegro;
	}
	
	
	public static ArrayList<ArrayList<ArrayList<Piezas>>> mountPiezas(){
		ArrayList<ArrayList<ArrayList<Piezas>>> piezas  = new ArrayList<>(2);
		
		//inicializo cada indice coin un arraylist Tridimensionl dentro
		for (int i = 0; i < 2; i++) {
		    piezas.add(new ArrayList<ArrayList<Piezas>>(6));
		    for (int j = 0; j < 6; j++) {
		        piezas.get(i).add(new ArrayList<Piezas>(8));
		    }
		}
		
		for (int i = 0; i <8; i++) {
			piezas.get(0).get(0).add(peonBlanco()); //8 peones blancos
		}
		
		for (int i = 0; i <2; i++) {
			piezas.get(0).get(1).add(torreBlanca()); //2 torres blancas
		}
		
		for (int i = 0; i <2; i++) {
			piezas.get(0).get(2).add(caballoBlanco()); //2 caballos blancos
		}
		
		for (int i = 0; i <2; i++) {
			piezas.get(0).get(3).add(alfilBlanco()); //2 alfiles blancos
		}
		
		piezas.get(0).get(4).add(reinaBlanca()); // reina blanca
		piezas.get(0).get(5).add(reyBlanco()); // rey blanco
		
		
		for (int i = 0; i <8; i++) {
			piezas.get(1).get(0).add(peonNegro()); //8 peones Negros
		}
		
		for (int i = 0; i <2; i++) {
			piezas.get(1).get(1).add(torreNegra()); //2 torres Negras
		}
		
		for (int i = 0; i <2; i++) {
			piezas.get(1).get(2).add(caballoNegro()); //2 caballos Negros
		}
		
		for (int i = 0; i <2; i++) {
			piezas.get(1).get(3).add(alfilNegro()); //2 alfiles Negros
		}
		
		piezas.get(1).get(4).add(reinaNegra()); // reina Negra
		piezas.get(1).get(5).add(reyNegro()); // rey Negro
		
		/*
		for (int i = 0; i < 2; i++) {
		    int edgeCount = piezas.get(i).size();
		    for (int j = 0; j < 6; j++) {
		        System.out.println(piezas.get(i).get(j));
		    }
		}
		*/
		
		return piezas;
	}
	
	
	/*public static void main(String[] args) {
		MountPiezas();
	}*/
}
