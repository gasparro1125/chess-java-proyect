package InterfazCMD;

import java.util.Scanner;
import Piezas.Piezas;
import table.table;

public class InterfaceComand {

	public static void ajedrez(){

		String[][] tablero = table.Begin();
		String mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		boolean statusReyBlanco = table.busquedaRey(0);
		boolean statusReyNegro = table.busquedaRey(1);
		Scanner teclado = new Scanner(System.in);

		while (statusReyBlanco == true && statusReyNegro == true) {
			
			System.out.println("Turno de las blancas.");

			Piezas elegida = null;

			boolean checkSelecBlanca = false;
			while (checkSelecBlanca == false) {
				System.out.println("Dime que pieza quieres mover.");
				System.out.print("Fila de la pieza: ");
				int pf = teclado.nextInt();
				System.out.print("Columna de la pieza: ");
				int pc = teclado.nextInt();
				elegida = table.SelectPieza(pf, pc);

				if (elegida == null) {
					System.out.println("Has elegido una casilla vacía");

				} else if (elegida.getColor() == "N") {
					System.out.println("Has elegido una pieza enemiga");
				} else {
					checkSelecBlanca = true;
				}

			}

			boolean checkMoveBlanca = false;
			while (checkMoveBlanca == false) {
				boolean checkPosibleBlanca;
				System.out.println("Dime a donde quieres moverla.");
				System.out.print("Fila a mover: ");
				int mf = teclado.nextInt();
				System.out.print("Columna a mover: ");
				int mc = teclado.nextInt();

				checkPosibleBlanca = elegida.move(elegida, mf, mc, table.checkStatus(), table.casillasVacias(tablero));

				if (checkPosibleBlanca == true) {
					tablero = table.movePieza(elegida, mf, mc, tablero);
					checkMoveBlanca = true;
					table.peonPolimorf(tablero);
					mostrarTablero = table.numberToTable(tablero);
				}
			}
			
			
			System.out.println(mostrarTablero);
			statusReyNegro = table.busquedaRey(1);
			if (statusReyNegro==false) break;
			
			System.out.println("Turno de las negras.");

			elegida = null;

			boolean checkSelecNegra = false;
			while (checkSelecNegra == false) {
				System.out.println("Dime que pieza quieres mover.");
				System.out.print("Fila de la pieza: ");
				int pf = teclado.nextInt();
				System.out.print("Columna de la pieza: ");
				int pc = teclado.nextInt();
				elegida = table.SelectPieza(pf, pc);

				if (elegida == null) {
					System.out.println("Has elegido una casilla vacía");

				} else if (elegida.getColor() == "B") {
					System.out.println("Has elegido una pieza enemiga");
				} else {
					checkSelecNegra = true;
				}

			}
			
			

			boolean checkMoveNegra = false;
			while (checkMoveNegra == false) {
				boolean checkPosibleNegra;
				System.out.println("Dime a donde quieres moverla.");
				System.out.print("Fila a mover: ");
				int mf = teclado.nextInt();
				System.out.print("Columna a mover: ");
				int mc = teclado.nextInt();

				checkPosibleNegra = elegida.move(elegida, mf, mc, table.checkStatus(), table.casillasVacias(tablero));

				if (checkPosibleNegra == true) {
					tablero = table.movePieza(elegida, mf, mc, tablero);
					checkMoveNegra = true;
					table.peonPolimorf(tablero);
					mostrarTablero = table.numberToTable(tablero);
				}
			}
 
			System.out.println(mostrarTablero);
			statusReyBlanco = table.busquedaRey(0);

			//table.muestreo();
		}
		System.out.println("Fin de la partida");

		// boolean[][] prueba = table.casillasVacias(tablero);

	}
}
