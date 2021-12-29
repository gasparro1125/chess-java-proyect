package comand;

import java.util.Iterator;

import javax.swing.text.TableView.TableRow;

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
	
	
	
	public static String[] piezas(){
		String[] piezas  = new String[6];
		piezas[0]="P";
		piezas[1]="T";
		piezas[2]="C";
		piezas[3]="A";
		piezas[4]="Q";
		piezas[5]="R";
		
		return piezas;
	}
	
	public static String[][] Begin(String [][] table, String [] piezas){
		String [][] tablero = table();
		String[] blancas = piezas();
		String[] negras = piezas();
		
		for(int i=0;i<8;i++) {
			if(i==0 || i == 7)tablero[0][i]= tablero[0][i].substring(0,1)+blancas[1]+"B"+tablero[0][i].substring(3);
			if(i==1 || i == 6)tablero[0][i]= tablero[0][i].substring(0,1)+blancas[2]+"B"+tablero[0][i].substring(3);
			if(i==2 || i == 5)tablero[0][i]= tablero[0][i].substring(0,1)+blancas[3]+"B"+tablero[0][i].substring(3);
			if(i==3)tablero[0][i]= tablero[0][i].substring(0,1)+blancas[4]+"B"+tablero[0][i].substring(3);
			if(i==4)tablero[0][i]= tablero[0][i].substring(0,1)+blancas[5]+"B"+tablero[0][i].substring(3);
		}
		
		for(int i=0;i<8;i++) {
			tablero[1][i]= tablero[1][i].substring(0,1)+blancas[0]+"B"+tablero[1][i].substring(3);
		}
		
		for(int i=0;i<8;i++) {
			if(i==0 || i == 7)tablero[7][i]= tablero[7][i].substring(0,1)+negras[1]+"N"+tablero[7][i].substring(3);
			if(i==1 || i == 6)tablero[7][i]= tablero[7][i].substring(0,1)+negras[2]+"N"+tablero[7][i].substring(3);
			if(i==2 || i == 5)tablero[7][i]= tablero[7][i].substring(0,1)+negras[3]+"N"+tablero[7][i].substring(3);
			if(i==3)tablero[7][i]= tablero[7][i].substring(0,1)+negras[4]+"N"+tablero[7][i].substring(3);
			if(i==4)tablero[7][i]= tablero[7][i].substring(0,1)+negras[5]+"N"+tablero[7][i].substring(3);
		}
		
		for(int i=0;i<8;i++) {
			tablero[6][i]= tablero[6][i].substring(0,1)+negras[0]+"N"+tablero[6][i].substring(3);
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
		return drawTable(Begin(table(), piezas()));
	}
	

	public static void main(String[] args) {
		System.out.println(situacion());
	}

}
