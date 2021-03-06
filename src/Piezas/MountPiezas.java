package Piezas;
import Piezas.Piezas;
import java.util.ArrayList;

public class MountPiezas {
	
	//Creo cada pieza blanca
	public static PeonBlanco peonBlanco(){
		PeonBlanco PeonBlanco = new PeonBlanco("P","B");
		return PeonBlanco;
	}
	
	public static Torre torreBlanca(){
		Torre TorreBlanca = new Torre("T","B");
		return TorreBlanca;
	}
	
	public static Caballo caballoBlanco(){
		Caballo CaballoBlanco = new Caballo("C","B");
		return CaballoBlanco;
	}

	public static Alfil alfilBlanco(){
		Alfil AlfilBlanco = new Alfil("A","B");
		return AlfilBlanco;
	}
	
	public static Reina reinaBlanca(){
		Reina ReinaBlanca = new Reina("Q","B");
		return ReinaBlanca;
	}
	
	public static Rey reyBlanco(){
		Rey ReyBlanco = new Rey("R","B");
		return ReyBlanco;
	}
	
//*************************************************************************
	
	//Creo cada pieza negra
	public static PeonNegro peonNegro(){
		PeonNegro PeonNegro = new PeonNegro("P","N");
		return PeonNegro;
	}
	
	public static Torre torreNegra(){
		Torre TorreNegra = new Torre("T","N");
		return TorreNegra;
	}
	
	public static Caballo caballoNegro(){
		Caballo CaballoNegro = new Caballo("C","N");
		return CaballoNegro;
	}

	public static Alfil alfilNegro(){
		Alfil AlfilNegro = new Alfil("A","N");
		return AlfilNegro;
	}
	
	public static Reina reinaNegra(){
		Reina ReinaNegra = new Reina("Q","N");
		return ReinaNegra;
	}
	
	public static Rey reyNegro(){
		Rey ReyNegro = new Rey("R","N");
		return ReyNegro;
	}
	
	//***********************************************************************************************
	//Montamos un arrayList donde guardaremos cada pieza de cada color y tipo 
	//y lo convertimos en un metodo para su futura utilizacion
	public static ArrayList<ArrayList<ArrayList<Piezas>>> mountPiezas(){
		ArrayList<ArrayList<ArrayList<Piezas>>> piezas  = new ArrayList<>(3);
		
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
		
		
		return piezas;
	}
	
	/*
	public static void main(String[] args) {
		ArrayList<ArrayList<ArrayList<Piezas>>> piezas =  mountPiezas();
		System.out.println(piezas.get(0).get(0).get(1).getClass());
		System.out.println(piezas.get(0).get(1).get(1).getClass());
		System.out.println(piezas.get(0).get(2).get(0).getClass());
		
	}
	*/
}
