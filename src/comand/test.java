package comand;

import javax.management.Query;

import Piezas.Piezas;
import table.table;

public class test {

	public static void main(String[] args) {
		
		String [][] tablero= table.Begin();
		String mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		Piezas elegida = table.SelectPieza(6,4);
		tablero = table.movePieza(elegida, 5, 4, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida, 2, 4, tablero);
		Piezas laqueComo = table.SelectPieza(1,4);
		System.out.println(elegida);
		System.out.println(laqueComo);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida, 1, 4, tablero);
		laqueComo = table.SelectPieza(1,4);
		System.out.println(elegida);
		System.out.println(laqueComo);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida, 2, 4, tablero);
		laqueComo = table.SelectPieza(1,4);
		System.out.println(elegida);
		System.out.println(laqueComo);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida, 1, 0, tablero);
		tablero = table.movePieza(elegida, 0, 0, tablero);
		tablero = table.movePieza(elegida, 1, 7, tablero);
		tablero = table.movePieza(elegida, 0, 1, tablero);
		tablero = table.movePieza(elegida, 0, 6, tablero);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		table.intento();
		
		
	}
}
