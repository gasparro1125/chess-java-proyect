package table;

import java.io.ObjectInputFilter.Status;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;

import Piezas.MountPiezas;
import Piezas.Piezas;
import java.util.Scanner;

import javax.naming.AuthenticationException;

public class table {

	// Creo el arrayList de Piezas con el metodo mountPiezas y le asigno cada
	// ubicacion a un tipo de pieza
	static MountPiezas guardo = new MountPiezas();
	static ArrayList<ArrayList<ArrayList<Piezas>>> piezas = guardo.mountPiezas();

	static ArrayList<Piezas> PeonBlanco = piezas.get(0).get(0);
	static ArrayList<Piezas> TorreBlanca = piezas.get(0).get(1);
	static ArrayList<Piezas> CaballoBlanco = piezas.get(0).get(2);
	static ArrayList<Piezas> AlfilBlanco = piezas.get(0).get(3);
	static ArrayList<Piezas> ReinaBlanca = piezas.get(0).get(4);
	static ArrayList<Piezas> ReyBlanco = piezas.get(0).get(5);

	static ArrayList<Piezas> PeonNegro = piezas.get(1).get(0);
	static ArrayList<Piezas> TorreNegra = piezas.get(1).get(1);
	static ArrayList<Piezas> CaballoNegro = piezas.get(1).get(2); // Crear cada pieza independiente
	static ArrayList<Piezas> AlfilNegro = piezas.get(1).get(3);
	static ArrayList<Piezas> ReinaNegra = piezas.get(1).get(4);
	static ArrayList<Piezas> ReyNegro = piezas.get(1).get(5);

	// Creamos un Array de las casillas
	public static String[][] table() {
		String[][] tablero = new String[8][8];
		int casillas = 0;
		boolean cambio = false;

		while (casillas < 64) {
			for (int i = 0; i < tablero.length; i++) {
				cambio = !cambio;
				for (int j = 0; j < tablero[i].length; j++) {
					if (cambio == false) {
						if (casillas % 2 == 0)
							tablero[i][j] = ("    ");
						else
							tablero[i][j] = ("[[]]");
						casillas++;
					} else {
						if (casillas % 2 != 0)
							tablero[i][j] = ("    ");
						else
							tablero[i][j] = ("[[]]");
						casillas++;
					}
				}
			}
		}
		return tablero;
	}

	// Numeramos cada posicion del tablero
	public static String numberToTable(String[][] tablero) {
		String linea = "       A    B    C    D    E     F    G    H\n";
		for (int i = 0; i < 8; i++) {
			linea += String.format("%4d ", i);
			for (int j = 0; j < 8; j++) {
				if (j < 7)
					linea += String.format("%5s", tablero[i][j]); // Representacion con distribuccion numerica
				else
					linea += String.format("%5s\n", tablero[i][j]);
			}
		}
		return linea;
	}

	// Metodo para represetnar una figura en cada casilla
	public static String representationShell(int x, int y, String a) {
		String[][] tablero = table();
		return tablero[x][y] = tablero[x][y].substring(0, 1) + a + tablero[x][y].substring(3);
	}

	// Metodo para dibujar el ajedrez con cada pieza en su posicion base
	public static String[][] Begin() {
		String[][] tablero = table();

		int pb = 0;
		int tb = 0;
		int cb = 0;
		int ab = 0;
		int pn = 0;
		int tn = 0;
		int cn = 0;
		int an = 0;

		for (int i = 0; i < 8; i++) {
			if (i == 0 || i == 7) {
				tablero[0][i] = representationShell(0, i, TorreBlanca.get(tb).getRepresentacion());
				TorreBlanca.get(tb).setPosicionX(0);
				TorreBlanca.get(tb).setPosicionY(i);
				tb++;
			}
			if (i == 1 || i == 6) {
				tablero[0][i] = representationShell(0, i, CaballoBlanco.get(cb).getRepresentacion());
				CaballoBlanco.get(cb).setPosicionX(0);
				CaballoBlanco.get(cb).setPosicionY(i);
				cb++;
			}
			if (i == 2 || i == 5) {
				tablero[0][i] = representationShell(0, i, AlfilBlanco.get(ab).getRepresentacion());
				AlfilBlanco.get(ab).setPosicionX(0);
				AlfilBlanco.get(ab).setPosicionY(i);
				ab++;
			}
			if (i == 3) {
				tablero[0][i] = representationShell(0, i, ReinaBlanca.get(0).getRepresentacion());
				ReinaBlanca.get(0).setPosicionX(0);
				ReinaBlanca.get(0).setPosicionY(i);
			}
			if (i == 4) {
				tablero[0][i] = representationShell(0, i, ReyBlanco.get(0).getRepresentacion());
				ReyBlanco.get(0).setPosicionX(0);
				ReyBlanco.get(0).setPosicionY(i);
			}
		}

		for (int i = 0; i < 8; i++) {
			tablero[1][i] = representationShell(1, i, PeonBlanco.get(pb).getRepresentacion());
			PeonBlanco.get(pb).setPosicionX(1);
			PeonBlanco.get(pb).setPosicionY(i);
			pb++;
		}

		for (int i = 0; i < 8; i++) {
			tablero[6][i] = representationShell(6, i, PeonNegro.get(pn).getRepresentacion());
			PeonNegro.get(pn).setPosicionX(6);
			PeonNegro.get(pn).setPosicionY(i);
			pn++;
		}

		for (int i = 0; i < 8; i++) {
			if (i == 0 || i == 7) {
				tablero[7][i] = representationShell(7, i, TorreNegra.get(tn).getRepresentacion());
				TorreNegra.get(tn).setPosicionX(7);
				TorreNegra.get(tn).setPosicionY(i);
				tn++;
			}

			if (i == 1 || i == 6) {
				tablero[7][i] = representationShell(7, i, CaballoNegro.get(cn).getRepresentacion());
				CaballoNegro.get(cn).setPosicionX(7);
				CaballoNegro.get(cn).setPosicionY(i);
				cn++;
			}
			if (i == 2 || i == 5) {
				tablero[7][i] = representationShell(7, i, AlfilNegro.get(an).getRepresentacion());
				AlfilNegro.get(an).setPosicionX(7);
				AlfilNegro.get(an).setPosicionY(i);
				an++;
			}
			if (i == 3) {
				tablero[7][i] = representationShell(7, i, ReinaNegra.get(0).getRepresentacion());
				ReinaNegra.get(0).setPosicionX(7);
				ReinaNegra.get(0).setPosicionY(i);
			}
			if (i == 4) {
				tablero[7][i] = representationShell(7, i, ReyNegro.get(0).getRepresentacion());
				ReyNegro.get(0).setPosicionX(7);
				ReyNegro.get(0).setPosicionY(i);
			}
		}

		return tablero;
	}

	// Metodo que me devuelve true si la casilla esta vacia
	public static boolean[][] casillasVacias(String[][] table) {
		String[][] tablero = table;
		boolean[][] casillasVacias = new boolean[8][8];

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == "[[]]" || tablero[i][j] == "    ")
					casillasVacias[i][j] = true;
				else
					casillasVacias[i][j] = false;
			}
		}
		return casillasVacias;
	}

	// Metodo mediante el cual elegimos la posicion de la pieza y nos la devuevle si
	// se encuentra en esa cordenada
	public static Piezas SelectPieza(int x, int y) {
		Piezas check = null;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				for (Integer l = 0; l < piezas.get(i).get(j).size(); l++) {
					if (piezas.get(i).get(j).get(l).getPosicionX() == x
							&& piezas.get(i).get(j).get(l).getPosicionY() == y) {
						check = piezas.get(i).get(j).get(l);
					}
				}
			}
		}
		return check;
	}

	// Metodo que mueve la pieza selecionada a la posicion indicada, pasando antes
	// por los filtros de movimiento
	// del tipo de pieza que sea
	public static String[][] movePieza(Piezas elegida, int x, int y, String[][] tablero) {

		if (elegida.move(elegida, x, y, piezas, casillasVacias(tablero)) == true) {
			int oldx = elegida.getPosicionX();
			int oldy = elegida.getPosicionY();

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 6; j++) {
					for (int z = 0; z < piezas.get(i).get(j).size(); z++) {
						if (piezas.get(i).get(j).get(z).getPosicionX() == x
								&& piezas.get(i).get(j).get(z).getPosicionY() == y) {
							piezas.get(i).get(j).remove(z);
						}
					}
				}
			}

			elegida.setPosicionX(x);
			elegida.setPosicionY(y);

			if (tablero[oldx][oldy].indexOf(" ") >= 0)
				tablero[oldx][oldy] = ("    ");
			else
				tablero[oldx][oldy] = ("[[]]");

			tablero[elegida.getPosicionX()][elegida.getPosicionY()] = representationShell(x, y,
					elegida.getRepresentacion());
		} else
			System.out.println("movimiento no posible");

		return tablero;
	}

	// Metodo para comprobar el estado de todas las piezas
	public static ArrayList<ArrayList<ArrayList<Piezas>>> checkStatus() {
		ArrayList<ArrayList<ArrayList<Piezas>>> piecillas = piezas;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				for (int z = 0; z < piecillas.get(i).get(j).size(); z++) {
				}
			}
		}
		return piecillas;
	}

	// Nos indica si el rey blanco(0) o negro(1) esta vivo
	public static boolean busquedaRey(int i) {
		ArrayList<ArrayList<ArrayList<Piezas>>> piezas = checkStatus();
		boolean rey = true;
		if (piezas.get(i).get(5).size() == 0)
			rey = false;
		return rey;

	}

	// metodo que se ejecuta cuando el peon llega con vida al final tablero
	public static void peonPolimorf(String[][] tablero) {
		// Peones Blancos
		for (int i = 0; i < piezas.get(0).get(0).size(); i++) {
			if (piezas.get(0).get(0).get(i).getPosicionX() == 7) {
				int posx = piezas.get(0).get(0).get(i).getPosicionX();
				int posy = piezas.get(0).get(0).get(i).getPosicionY();
				piezas.get(0).get(0).remove(i);
				System.out.println("podemos evolucionar el peon blanco a:");
				Scanner teclado = new Scanner(System.in);
				System.out.printf(" 1- Torre\n 2- Caballo \n 3-Alfil \n 4-Reina\n");
				int respuesta = 0;

				while (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4) {
					System.out.print("¿Que eliges?: ");
					respuesta = teclado.nextInt();
				}

				if (respuesta == 1) {
					Piezas piezaEvolucionadoPiezas = MountPiezas.torreBlanca();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(0).get(1).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				} else if (respuesta == 2) {
					Piezas piezaEvolucionadoPiezas = MountPiezas.caballoBlanco();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(0).get(2).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				} else if (respuesta == 3) {
					Piezas piezaEvolucionadoPiezas = MountPiezas.alfilBlanco();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(0).get(3).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				} else {
					Piezas piezaEvolucionadoPiezas = MountPiezas.reinaBlanca();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(0).get(4).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				}
			}
		}

		// Peones negros
		for (int i = 0; i < piezas.get(1).get(0).size(); i++) {
			if (piezas.get(1).get(0).get(i).getPosicionX() == 0) {
				int posx = piezas.get(1).get(0).get(i).getPosicionX();
				int posy = piezas.get(1).get(0).get(i).getPosicionY();
				piezas.get(1).get(0).remove(i);
				System.out.println("podemos evolucionar el peon negro a:");
				Scanner teclado = new Scanner(System.in);
				System.out.printf(" 1- Torre\n 2- Caballo \n 3-Alfil \n 4-Reina\n");
				int respuesta = 0;

				while (respuesta != 1 && respuesta != 2 && respuesta != 3 && respuesta != 4) {
					System.out.print("¿Que eliges?: ");
					respuesta = teclado.nextInt();
				}

				if (respuesta == 1) {
					Piezas piezaEvolucionadoPiezas = MountPiezas.torreNegra();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(1).get(1).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				} else if (respuesta == 2) {
					Piezas piezaEvolucionadoPiezas = MountPiezas.caballoNegro();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(1).get(2).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				} else if (respuesta == 3) {
					Piezas piezaEvolucionadoPiezas = MountPiezas.alfilNegro();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(1).get(3).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				} else {
					Piezas piezaEvolucionadoPiezas = MountPiezas.reinaNegra();
					piezaEvolucionadoPiezas.setPosicionX(posx);
					piezaEvolucionadoPiezas.setPosicionY(posy);

					piezas.get(1).get(4).add(piezaEvolucionadoPiezas);
					tablero[piezaEvolucionadoPiezas.getPosicionX()][piezaEvolucionadoPiezas
							.getPosicionY()] = representationShell(posx, posy,
									piezaEvolucionadoPiezas.getRepresentacion());
				}
			}
		}
	}

	// Funcion Jaque, introducimos el color del rey que queremos comprobar si esta
	// en jaque
	public static boolean Jaque(String color, String[][] tablero) {
		boolean jaqueBlanca = false;
		boolean jaqueNegra = false;
		boolean check = false;
		boolean[][] posible = new boolean[8][8];
		ArrayList<ArrayList<ArrayList<Piezas>>> piecillas = piezas;

		for (int i = 0; i < posible.length; i++) {
			for (int j = 0; j < posible[i].length; j++) {
				posible[i][j] = false;
			}
		}

		if (color == "N") {
			for (int j = 0; j < 6; j++) {
				for (int z = 0; z < piecillas.get(0).get(j).size(); z++) {
					// System.out.println(piecillas.get(0).get(j).get(z));
					for (int k = 0; k < 8; k++) {
						for (int l = 0; l < 8; l++) {
							if (piecillas.get(0).get(j).get(z).move(piecillas.get(0).get(j).get(z), k, l, piezas,
									casillasVacias(tablero)) == true) {
								posible[k][l] = true;
								// System.out.println(piecillas.get(0).get(j).get(z)+" voy a ir x: "+k +" voy a
								// ir y: "+l);
							}
						}
					}
				}
			}

			if (posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(0).getPosicionY()]) {
				check = true;
				jaqueNegra = true;
			}

		} else {
			for (int j = 0; j < 6; j++) {
				for (int z = 0; z < piecillas.get(1).get(j).size(); z++) {
					for (int k = 0; k < 8; k++) {
						for (int l = 0; l < 8; l++) {
							if (piecillas.get(1).get(j).get(z).move(piecillas.get(1).get(j).get(z), k, l, piezas,
									casillasVacias(tablero)) == true) {
								posible[k][l] = true;
								// System.out.println(piecillas.get(1).get(j).get(z)+" voy a ir x: "+k +" voy a
								// ir y: "+l);
							}
						}
					}
				}
			}

			if (posible[piezas.get(0).get(5).get(0).getPosicionX()][piezas.get(0).get(5).get(0).getPosicionY()]) {
				check = true;
				jaqueBlanca = true;
			}
		}

		/*
		 * for (int i = 0; i < posible.length; i++) { for (int j = 0; j <
		 * posible[i].length; j++) { System.out.println("posiciones x,y: "+
		 * i+" "+j+" es :"+ posible[i][j]); } }
		 */

		if (jaqueBlanca == true) {
			/*int respuesta=-1;
			System.out.println("Atento!!!! el rey blanco  esta en jaque !!!!");
			System.out.println();
			System.out.printf("-Jugador blanco, escribe 0 para asumir la derrota por Jaque Mate \n o cualquier otra cosa para continuar para continuar la partida:");
			boolean checkvueltaFile = true;
			do {
				try {
					checkvueltaFile = true;
					Scanner teclado = new Scanner(System.in);
					respuesta = teclado.nextInt();

				} catch (InputMismatchException e) {
				}
				
			} while (!checkvueltaFile);
			
			if (respuesta == 0) {
				System.out.println("El jugador negro ha ganado!");
				piezas.get(0).get(5).remove(0);
			}
			else System.out.println("La partida continua...");*/
		}

		else if (jaqueNegra == true) {
			/*int respuesta2=-1;
		
			System.out.println("Atento!!!! el rey negro  esta en jaque !!!!");
			System.out.println();
			System.out.printf("-Jugador negro, escribe 0 para asumir la derrota por Jaque Mate \n o cualquier otra cosa para continuar para continuar la partida:");
			boolean checkvueltaFile = true;
			do {
				try {
					checkvueltaFile = true;
					Scanner teclado = new Scanner(System.in);
					respuesta2 = teclado.nextInt();

				} catch (InputMismatchException e) {
				}
				
			} while (!checkvueltaFile);
			if (respuesta2 == 0) {
				System.out.println("El jugador blanco ha ganado!");
				piezas.get(1).get(5).remove(0);
			}
			else System.out.println("La partida continua...");*/
			}

		return check;
	}
	
	/*public static void Contador() {
		System.out.println(piezas.get(0).get(5).get(0).getContrey());
		System.out.println(piezas.get(1).get(5).get(0).getContrey());
		System.out.println(piezas.get(0).get(1).get(0).getcontTorre());
		System.out.println(piezas.get(0).get(1).get(1).getcontTorre());
		System.out.println(piezas.get(1).get(1).get(0).getcontTorre());
		System.out.println(piezas.get(1).get(1).get(1).getcontTorre());
	} */
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * public static boolean mate(String color, String [][] tablero) { boolean
	 * mateBlanca = false; boolean mateNegra = false; boolean check = false;
	 * 
	 * 
	 * boolean[][] posible = new boolean[8][8]; boolean[][] posibleRey = new boolean
	 * [8][8]; ArrayList<Boolean> finalsituation = new ArrayList<>(); // si solo hay
	 * true en los posible smovimientos del rey es jaque mate
	 * 
	 * ArrayList<ArrayList<ArrayList<Piezas>>> piecillas = piezas;
	 * 
	 * for (int i = 0; i < posible.length; i++) { for (int j = 0; j <
	 * posible[i].length; j++) { posible[i][j] = false; } }
	 * 
	 * if (color == "N") { int cont = 0;
	 * 
	 * for (int j = 0; j < 6; j++) { for (int z = 0; z <
	 * piecillas.get(0).get(j).size(); z++) {
	 * //System.out.println(piecillas.get(0).get(j).get(z)); for (int k = 0; k < 8;
	 * k++) { for (int l = 0; l < 8; l++) { if
	 * (piecillas.get(0).get(j).get(z).move(piecillas.get(0).get(j).get(z), k, l,
	 * piezas, casillasVacias(tablero))==true) { posible[k][l]=true;
	 * //System.out.println(piecillas.get(0).get(j).get(z)+" voy a ir x: "+k
	 * +" voy a ir y: "+l); } } } } }
	 * 
	 * 
	 * //solo haga movimientos del rey del rey, es decir deberiamos guardar un array
	 * con los unicos movimientos posibles de el rey y comprobarlos //una vez
	 * tengamos dichas cordenadas de movimientos posibles del rey, realizamos la
	 * comparacion String[][] tableroJaque = table();
	 * tableroJaque[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5)
	 * .get(0).getPosicionY()] =
	 * representationShell(piezas.get(1).get(5).get(0).getPosicionX(),piezas.get(1).
	 * get(5).get(0).getPosicionY(),
	 * piezas.get(1).get(5).get(0).getRepresentacion());
	 * 
	 * //aqui deberia comprobar las coordenas del rey en este neuvo tablero y
	 * guardar todo las cordanas posibles ArrayList<Integer> posiblesCordenadasX =
	 * new ArrayList<>(); ArrayList<Integer> posiblesCordenadasY = new
	 * ArrayList<>();
	 * 
	 * for (int k = 0; k < 8; k++) { for (int l = 0; l < 8; l++) {
	 * if(piezas.get(1).get(5).get(0).move(piezas.get(1).get(5).get(0), k, l,
	 * piezas, casillasVacias(tablero))==true) posibleRey[k][l]= true; else
	 * posibleRey[k][l] = false;
	 * 
	 * } }
	 * 
	 * 
	 * 
	 * for (int t = 0; t < 8; t++) { for (int z = 0; t < 8; t++) {
	 * 
	 * if(posible[t][z]==true && posibleRey[t][z]==true &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==true) finalsituation.add(true); else
	 * if(posible[t][z]==true && posibleRey[t][z]==false &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==true) finalsituation.add(true); else
	 * if(posible[t][z]==true && posibleRey[t][z]==false &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==false) finalsituation.add(false); else
	 * if(posible[t][z]==false && posibleRey[t][z]==true &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==true) finalsituation.add(false); else
	 * if(posible[t][z]==false && posibleRey[t][z]==true &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==false) finalsituation.add(false); else
	 * if(posible[t][z]==false && posibleRey[t][z]==false &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==true) finalsituation.add(true); else
	 * if(posible[t][z]==false && posibleRey[t][z]==false &&
	 * posible[piezas.get(1).get(5).get(0).getPosicionX()][piezas.get(1).get(5).get(
	 * 0).getPosicionY()]==false) finalsituation.add(false); } }
	 * 
	 * 
	 * 
	 * for (Boolean boolean1 : finalsituation) { if (boolean1 == true) cont++; }
	 * 
	 * if(cont == 0) mateNegra= false; else mateNegra= true;
	 * 
	 * 
	 * } else { int cont = 0;
	 * 
	 * for (int j = 0; j < 6; j++) { for (int z = 0; z <
	 * piecillas.get(1).get(j).size(); z++) { for (int k = 0; k < 8; k++) { for (int
	 * l = 0; l < 8; l++) { if
	 * (piecillas.get(1).get(j).get(z).move(piecillas.get(1).get(j).get(z), k, l,
	 * piezas, casillasVacias(tablero))==true) { posible[k][l]=true;
	 * //System.out.println(piecillas.get(1).get(j).get(z)+" voy a ir x: "+k
	 * +" voy a ir y: "+l); } } } } }
	 * 
	 * for (int k = 0; k < 8; k++) { for (int l = 0; l < 8; l++) {
	 * if(piezas.get(0).get(5).get(0).move(piezas.get(0).get(5).get(0), k, l,
	 * piezas, casillasVacias(tablero))==true) posibleRey[k][l]= true; else
	 * posibleRey[k][l] = false;
	 * 
	 * } }
	 * 
	 * for (int t = 0; t < 8; t++) { for (int z = 0; t < 8; t++) {
	 * 
	 * if(posible[t][z]==true && posibleRey[t][z]==true) finalsituation.add(true);
	 * else if(posible[t][z]==true && posibleRey[t][z]==false)
	 * finalsituation.add(false); else if(posible[t][z]==false &&
	 * posibleRey[t][z]==true) finalsituation.add(false); else
	 * if(posible[t][z]==false && posibleRey[t][z]==false)
	 * finalsituation.add(false); else if(posible[t][z]==true &&
	 * t==piezas.get(0).get(5).get(0).getPosicionX() && z==
	 * piezas.get(0).get(5).get(0).getPosicionY()) finalsituation.add(true); } }
	 * 
	 * for (Boolean boolean1 : finalsituation) { if (boolean1 == true) cont++; }
	 * 
	 * if(cont == 0) mateBlanca= false; else mateBlanca= true; }
	 * 
	 * /*for (int i = 0; i < posible.length; i++) { for (int j = 0; j <
	 * posible[i].length; j++) { System.out.println("posiciones x,y: "+
	 * i+" "+j+" es :"+ posible[i][j]); } }//*
	 * 
	 * if (mateBlanca==true) { check = mateBlanca;
	 * System.out.println("Fin del juego, Jaque Mate al rey Blanco"); } else
	 * if(mateNegra== true) { check = mateNegra;
	 * System.out.println("Fin del juego, Jaque Mate al rey Nengro"); }
	 * 
	 * return check;
	 * 
	 * }
	 */

	/*
	 * public static void muestreo() { for (int i = 0; i < 2; i++) { for (int j = 0;
	 * j < 6; j++) { for (int z = 0; z < piezas.get(i).get(j).size(); z++) {
	 * System.out.println(piezas.get(i).get(j).get(z)); } } } }
	 */

}
