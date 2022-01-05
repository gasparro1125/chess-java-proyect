package comand;


import Piezas.Piezas;
import table.table;

public class test {

	public static void main(String[] args) {
		
		String [][] tablero= table.Begin();
		String mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		Piezas elegida = table.SelectPieza(6,1);
		

		tablero = table.movePieza(elegida, 5, 1, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		elegida = table.SelectPieza(6,4);
		

		tablero = table.movePieza(elegida, 4, 4, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		
		elegida = table.SelectPieza(7,2);
		
		tablero = table.movePieza(elegida, 6,1, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		tablero = table.movePieza(elegida, 4,3, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		
		elegida = table.SelectPieza(6,2);
		
		tablero = table.movePieza(elegida, 4,2, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);	
		
		elegida = table.SelectPieza(6,5);
		
		tablero = table.movePieza(elegida, 5,5, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);	
		
		elegida = table.SelectPieza(4,3);
		
		tablero = table.movePieza(elegida, 6,5, tablero);
		System.out.println(elegida);
		mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);	

		
		
		boolean[][] prueba= table.casillasVacias(tablero);
		
		System.out.println(prueba[4][5]);
		
		
		//tablero = table.movePieza(elegida, 0, 0, tablero);
		//tablero = table.movePieza(elegida, 1, 7, tablero);
		//tablero = table.movePieza(elegida, 0, 1, tablero);
		//tablero = table.movePieza(elegida, 0, 6, tablero);
		//mostrarTablero = table.numberToTable(tablero);
		
		
	}
}
