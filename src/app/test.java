package app;

import java.awt.Container;
import java.util.ArrayList;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		String linea = "       a    b    c    d    e     f    g    h\n";
		for (int i = 0; i < 8; i++) {
			linea+= String.format("%4d ", i+1);
			for (int j = 0; j < 8; j++) {
				if(j<7)linea += String.format("%5s", tablero[i][j]);
				else linea += String.format("%5s\n", tablero[i][j]);
			}
		}
		
		System.out.println(linea);
		
	}

}
