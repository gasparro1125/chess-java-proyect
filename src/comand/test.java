package comand;


import Piezas.Piezas;
import table.table;

public class test {

	public static void main(String[] args) {
		
		String [][] tablero= table.Begin();
		String mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		Piezas elegida = table.SelectPieza(7,0);
		/*
		tablero = table.movePieza(elegida, 4, 1, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		elegida = table.SelectPieza(1,0);
		
		tablero = table.movePieza(elegida, 3, 0, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		elegida = table.SelectPieza(1,1);
		
		tablero = table.movePieza(elegida, 3, 1, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);

		
		

		elegida = table.SelectPieza(1,2);
		
		tablero = table.movePieza(elegida, 3, 2, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		tablero = table.movePieza(elegida, 4, 1, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida, 5, 0, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		elegida = table.SelectPieza(3,1);
		tablero = table.movePieza(elegida, 4, 1, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		*/
		
		elegida = table.SelectPieza(6,0);
		
		tablero = table.movePieza(elegida,4,0 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		elegida = table.SelectPieza(7,0);
		
		tablero = table.movePieza(elegida,5,0 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,5,7 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		elegida = table.SelectPieza(6,7);
		
		tablero = table.movePieza(elegida,4,7 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		elegida = table.SelectPieza(5,7);
		
		tablero = table.movePieza(elegida,4,7 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,5,6 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,1,6 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,3,6 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,3,1 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,0,1 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		tablero = table.movePieza(elegida,6,1 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,1,1 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,0,1 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,0,3 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,0,0 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		

		tablero = table.movePieza(elegida,2,0 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,5,0 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida,3,0 , tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		boolean[][] prueba= table.casillasVacias(tablero);
		
		System.out.println(prueba[7][1]);
		
		
		//tablero = table.movePieza(elegida, 0, 0, tablero);
		//tablero = table.movePieza(elegida, 1, 7, tablero);
		//tablero = table.movePieza(elegida, 0, 1, tablero);
		//tablero = table.movePieza(elegida, 0, 6, tablero);
		//mostrarTablero = table.numberToTable(tablero);
		
		
	}
}
