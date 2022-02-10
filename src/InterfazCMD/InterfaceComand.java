package InterfazCMD;

import java.util.InputMismatchException;
import java.util.Scanner;
import Piezas.Piezas;
import table.table;

public class InterfaceComand {

	public static void ajedrez() {

		String[][] tablero = table.Begin();
		String mostrarTablero = table.numberToTable(tablero);
		System.out.println(mostrarTablero);
		Scanner teclado = new Scanner(System.in);

		boolean statusReyBlanco = table.busquedaRey(0);
		boolean statusReyNegro = table.busquedaRey(1);

		while (statusReyBlanco == true && statusReyNegro == true) {
			// table.Contador();
			System.out.println("Turno de las blancas.");

			Piezas elegida = null;
			boolean volverBlancaSelect = false;

			while (volverBlancaSelect == false) {

				boolean checkSelecBlanca = false;
				while (checkSelecBlanca == false) {
					System.out.println("Dime que pieza quieres mover.");

					System.out.print("Columna de la pieza: ");
					String pcString = teclado.next();
					int pc = -1;
					pcString = pcString.toLowerCase();

					switch (pcString) {
					case "a":
						pc = 0;
						break;
					case "b":
						pc = 1;
						break;
					case "c":
						pc = 2;
						break;
					case "d":
						pc = 3;
						break;
					case "e":
						pc = 4;
						break;
					case "f":
						pc = 5;
						break;
					case "g":
						pc = 6;
						break;
					case "h":
						pc = 7;
						break;
					}
					int pf = -2;
					boolean checkFormatFile = true;
					do {
						try {
							checkFormatFile = true;
							System.out.print("Fila de la pieza: ");
							pf = teclado.nextInt();

						} catch (InputMismatchException e) {
							teclado.next();
						}
					} while (!checkFormatFile);

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
				boolean volver = false;
				while (checkMoveBlanca == false) {
					boolean checkPosibleBlanca;
					int mc = 99;

					System.out.println("Dime a donde quieres moverla, (escribe 11 para cancelar este movimiento)");

					System.out.print("Columna a mover: ");
					String mcString = teclado.next();
					mcString = mcString.toLowerCase();

					switch (mcString) {
					case "a":
						mc = 0;
						break;
					case "b":
						mc = 1;
						break;
					case "c":
						mc = 2;
						break;
					case "d":
						mc = 3;
						break;
					case "e":
						mc = 4;
						break;
					case "f":
						mc = 5;
						break;
					case "g":
						mc = 6;
						break;
					case "h":
						mc = 7;
						break;
					case "11":
						mc = 11;
						break;
					}

					if (mc == 11)
						volver = true;

					int mf = -2;
					if (mc != 11) {
						boolean checkFormatFile = true;
						do {
							try {
								checkFormatFile = true;
								System.out.print("Fila a mover: ");
								mf = teclado.nextInt();

							} catch (InputMismatchException e) {
								teclado.next();
							}
						} while (!checkFormatFile);
					}
					if (mf == 11)
						volver = true;

					checkPosibleBlanca = elegida.move(elegida, mf, mc, table.checkStatus(),
							table.casillasVacias(tablero));

					if (checkPosibleBlanca == true) {
						tablero = table.movePieza(elegida, mf, mc, tablero);
						checkMoveBlanca = true;
						table.peonPolimorf(tablero);
						mostrarTablero = table.numberToTable(tablero);
					} else if (volver == true)
						checkMoveBlanca = true;
				}

				if (checkSelecBlanca == true && checkMoveBlanca == true & volver == false)
					volverBlancaSelect = true;
			}

			System.out.println(mostrarTablero);

			statusReyNegro = table.busquedaRey(1);
			if (statusReyNegro == false) {
				break;
			} else if (table.Jaque("N", tablero) == true) {
				int respuesta2 = -1;

				System.out.println();
				System.out.println("Atento!!!! el rey negro  esta en jaque !!!!");
				System.out.printf(
						"-Jugador negro, escribe 0 para asumir la derrota por Jaque Mate \n o cualquier otra cosa para continuar para continuar la partida:");
				boolean checkvueltaFile = true;
				do {
					try {
						checkvueltaFile = true;
						Scanner teclado2 = new Scanner(System.in);
						respuesta2 = teclado2.nextInt();

					} catch (InputMismatchException e) {
					}

				} while (!checkvueltaFile);
				if (respuesta2 == 0) {
					System.out.println("El jugador blanco ha ganado!");
					statusReyNegro = false;
					break;
				} else
					System.out.println("La partida continua...");
			}

			// table.Contador();
			System.out.println("Turno de las negras.");

			elegida = null;

			boolean volverNegraSelect = false;

			while (volverNegraSelect == false) {

				boolean checkSelecNegra = false;
				while (checkSelecNegra == false) {
					System.out.println("Dime que pieza quieres mover.");

					System.out.print("Columna de la pieza: ");
					String pcString = teclado.next();
					int pc = -1;
					pcString = pcString.toLowerCase();

					switch (pcString) {
					case "a":
						pc = 0;
						break;
					case "b":
						pc = 1;
						break;
					case "c":
						pc = 2;
						break;
					case "d":
						pc = 3;
						break;
					case "e":
						pc = 4;
						break;
					case "f":
						pc = 5;
						break;
					case "g":
						pc = 6;
						break;
					case "h":
						pc = 7;
						break;
					}

					int pf = -2;
					boolean checkFormatFile = true;
					do {
						try {
							checkFormatFile = true;
							System.out.print("Fila de la pieza: ");
							pf = teclado.nextInt();

						} catch (InputMismatchException e) {
							teclado.next();
						}
					} while (!checkFormatFile);

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
				boolean volver = false;
				while (checkMoveNegra == false) {
					boolean checkPosibleNegra;
					int mc = 99;

					System.out.println("Dime a donde quieres moverla, (escribe 11 para cancelar este movimiento)");

					System.out.print("Columna a mover: ");
					String mcString = teclado.next();
					mcString = mcString.toLowerCase();

					switch (mcString) {
					case "a":
						mc = 0;
						break;
					case "b":
						mc = 1;
						break;
					case "c":
						mc = 2;
						break;
					case "d":
						mc = 3;
						break;
					case "e":
						mc = 4;
						break;
					case "f":
						mc = 5;
						break;
					case "g":
						mc = 6;
						break;
					case "h":
						mc = 7;
						break;
					case "11":
						mc = 11;
						break;
					}
					if (mc == 11)
						volver = true;

					int mf = -2;
					if (mc != 11) {

						boolean checkFormatFile = true;
						do {
							try {
								checkFormatFile = true;
								System.out.print("Fila a mover: ");
								mf = teclado.nextInt();

							} catch (InputMismatchException e) {
								teclado.next();
							}
						} while (!checkFormatFile);
					}
					if (mf == 11)
						volver = true;

					checkPosibleNegra = elegida.move(elegida, mf, mc, table.checkStatus(),
							table.casillasVacias(tablero));

					if (checkPosibleNegra == true) {
						tablero = table.movePieza(elegida, mf, mc, tablero);
						checkMoveNegra = true;
						table.peonPolimorf(tablero);
						mostrarTablero = table.numberToTable(tablero);
					} else if (volver == true)
						checkMoveNegra = true;
				}
				if (checkSelecNegra == true && checkMoveNegra == true & volver == false)
					volverNegraSelect = true;

			}
			System.out.println(mostrarTablero);

			statusReyBlanco = table.busquedaRey(0);
			if (statusReyBlanco == false)
				break;

			else if (table.Jaque("B", tablero) == true) {
				;
				int respuesta = -1;
				
				System.out.println();
				System.out.println("Atento!!!! el rey blanco  esta en jaque !!!!");
				System.out.printf(
						"-Jugador blanco, escribe 0 para asumir la derrota por Jaque Mate \n o cualquier otra cosa para continuar para continuar la partida:");
				boolean checkvueltaFile = true;
				do {
					try {
						checkvueltaFile = true;
						Scanner teclado3 = new Scanner(System.in);
						respuesta = teclado3.nextInt();

					} catch (InputMismatchException e) {
					}

				} while (!checkvueltaFile);

				if (respuesta == 0) {
					System.out.println("El jugador negro ha ganado!");
					statusReyBlanco = false;
				} else
					System.out.println("La partida continua...");
			}

			// table.muestreo();
		}
		System.out.println("Fin de la partida");

		// boolean[][] prueba = table.casillasVacias(tablero);

	}
}
