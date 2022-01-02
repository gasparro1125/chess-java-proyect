package comand;

import java.util.ArrayList;

import Piezas.Piezas;
import Piezas.MountPiezas;

public class test {
	
	public static String[][] table() {
		String[][] tablero  = new String[8][8];
		int casillas = 0;
		boolean cambio=false;
		
		while (casillas<64) {
			for (int i = 0; i < tablero.length; i++) {
				cambio = !cambio;
				for (int j = 0; j < tablero[i].length; j++) {
					if(cambio==false) {
						if(casillas%2==0) tablero[i][j]=("     ");
						else tablero[i][j]=("|||||");
						casillas++;
					}else {
						if(casillas%2!=0) tablero[i][j]=("     ");
						else tablero[i][j]=("|||||");
						casillas++;
					}
				}
			}
		}
		return tablero;
	}
	

	
	
	

	public static String[][] Begin(String [][] table){
		String [][] tablero = table();
		MountPiezas guardo = new MountPiezas();
		ArrayList<ArrayList<ArrayList<Piezas>>> piezas = guardo.mountPiezas();
		
		ArrayList<Piezas> PeonBlanco = piezas.get(0).get(0);
		ArrayList<Piezas> TorreBlanca = piezas.get(0).get(1);
		ArrayList<Piezas> CaballoBlanco = piezas.get(0).get(2);
		ArrayList<Piezas> AlfilBlanco = piezas.get(0).get(3);
		ArrayList<Piezas> ReinaBlanca = piezas.get(0).get(4);
		ArrayList<Piezas> ReyBlanco = piezas.get(0).get(5);
		
		ArrayList<Piezas> PeonNegro = piezas.get(1).get(0);
		ArrayList<Piezas> TorreNegra = piezas.get(1).get(1);
		ArrayList<Piezas> CaballoNegro = piezas.get(1).get(2); 		//Crear cada pieza independiente
		ArrayList<Piezas> AlfilNegro = piezas.get(1).get(3);
		ArrayList<Piezas> ReinaNegra = piezas.get(1).get(4);
		ArrayList<Piezas> ReyNegro = piezas.get(1).get(5);
		
		int pb =0;
		int tb =0;
		int cb =0;
		int ab =0;
		int pn =0;
		int tn =0;
		int cn =0;
		int an =0;
		
		
		
		for(int i=0;i<8;i++) {
			if(i==0 || i == 7) {
				tablero[0][i]= tablero[0][i].substring(0,1)+TorreBlanca.get(tb).getRepresentacion()+tablero[0][i].substring(3);
				TorreBlanca.get(tb).setPosicionX(0);
				TorreBlanca.get(tb).setPosicionY(i);
				tb++;
			}
			if(i==1 || i == 6) {
				tablero[0][i]= tablero[0][i].substring(0,1)+CaballoBlanco.get(cb).getRepresentacion()+tablero[0][i].substring(3);
				CaballoBlanco.get(cb).setPosicionX(0);
				CaballoBlanco.get(cb).setPosicionY(i);
				cb++;
			}
			if(i==2 || i == 5) {
				tablero[0][i]= tablero[0][i].substring(0,1)+AlfilBlanco.get(ab).getRepresentacion()+tablero[0][i].substring(3);
				AlfilBlanco.get(ab).setPosicionX(0);
				AlfilBlanco.get(ab).setPosicionY(i);
				ab++;
			}
			if(i==3) {
				tablero[0][i]= tablero[0][i].substring(0,1)+ReinaBlanca.get(0).getRepresentacion()+tablero[0][i].substring(3);
				ReinaBlanca.get(0).setPosicionX(0);
				ReinaBlanca.get(0).setPosicionY(i);
			}
			if(i==4) {
				tablero[0][i]= tablero[0][i].substring(0,1)+ReyBlanco.get(0).getRepresentacion()+tablero[0][i].substring(3);
				ReyBlanco.get(0).setPosicionX(0);
				ReyBlanco.get(0).setPosicionY(i);
			}
		}
		
		for(int i=0;i<8;i++) {
			tablero[1][i]= tablero[1][i].substring(0,1)+PeonBlanco.get(pb).getRepresentacion()+tablero[1][i].substring(3);
			PeonBlanco.get(pb).setPosicionX(1);
			PeonBlanco.get(pb).setPosicionY(i);
			pb++;
		}
		
		for(int i=0;i<8;i++) {
			tablero[6][i]= tablero[6][i].substring(0,1)+PeonNegro.get(pn).getRepresentacion()+tablero[6][i].substring(3);
			PeonNegro.get(pn).setPosicionX(6);
			PeonNegro.get(pn).setPosicionX(i);
			pn++;
		}
		
		for(int i=0;i<8;i++) {
			if(i==0 || i == 7) {
				tablero[7][i]= tablero[7][i].substring(0,1)+TorreNegra.get(tn).getRepresentacion()+tablero[7][i].substring(3);
				TorreNegra.get(tn).setPosicionX(7);
				TorreNegra.get(tn).setPosicionY(i);
				tn++;
			}
			
			if(i==1 || i == 6) {
				tablero[7][i]= tablero[7][i].substring(0,1)+CaballoNegro.get(cn).getRepresentacion()+tablero[7][i].substring(3);
				CaballoNegro.get(cn).setPosicionX(7);
				CaballoNegro.get(cn).setPosicionY(i);
				cn++;
			}
			if(i==2 || i == 5) {
				tablero[7][i]= tablero[7][i].substring(0,1)+AlfilNegro.get(an).getRepresentacion()+tablero[7][i].substring(3);
				AlfilNegro.get(an).setPosicionX(7);
				AlfilNegro.get(an).setPosicionY(i);
				an++;
			}
			if(i==3) {
				tablero[7][i]= tablero[7][i].substring(0,1)+ReinaNegra.get(0).getRepresentacion()+tablero[7][i].substring(3);
				ReinaNegra.get(0).setPosicionX(7);
				ReinaNegra.get(0).setPosicionY(i);
			}
			if(i==4) {
				tablero[7][i]= tablero[7][i].substring(0,1)+ReyNegro.get(0).getRepresentacion()+tablero[7][i].substring(3);
				ReyNegro.get(0).setPosicionX(7);
				ReyNegro.get(0).setPosicionY(i);
			}
		}	
		return tablero;
	}
	

	public static String drawTable(String[][] tablero) {
		String linea = "       0    1    2    3    4     5    6    7\n";
		for (int i = 0; i < 8; i++) {
			linea+= String.format("%4d ", i);
			for (int j = 0; j < 8; j++) {
				if(j<7)linea += String.format("%5s", tablero[i][j]);
				else linea += String.format("%5s\n", tablero[i][j]);
			}
		}
		
		return linea;
	}
	
	public static String situacion () {
		return drawTable(Begin(table()));
	}
	

	public static void main(String[] args) {
		System.out.println(situacion());
		
	}
}
