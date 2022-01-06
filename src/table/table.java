package table;

import java.awt.print.Book;
import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.Iterator;

import Piezas.MountPiezas;
import Piezas.Piezas;

public class table {

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

	public static String[][] table() {
		String[][] tablero = new String[8][8];
		int casillas = 0;
		boolean cambio = false;

		while (casillas < 64) {
			for (int i = 0; i < tablero.length; i++) {
				cambio = !cambio;
				for (int j = 0; j < tablero[i].length; j++) {
					if (cambio == false) { // Representacion abse
						if (casillas % 2 == 0)
							tablero[i][j] = ("    ");
						else
							tablero[i][j] = ("||||");
						casillas++;
					} else {
						if (casillas % 2 != 0)
							tablero[i][j] = ("    ");
						else
							tablero[i][j] = ("||||");
						casillas++;
					}
				}
			}
		}
		return tablero;
	}

	public static String numberToTable(String[][] tablero) {
		String linea = "       0    1    2    3    4     5    6    7\n";
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

	public static String representationShell(int x, int y, String a) {
		String[][] tablero = table();
		return tablero[x][y] = tablero[x][y].substring(0, 1) + a + tablero[x][y].substring(3);
	}

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

	public static boolean[][] casillasVacias(String[][] table) {
		String[][] tablero = table;
		boolean[][] casillasVacias = new boolean[8][8];

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j] == "||||" || tablero[i][j] == "    ")
					casillasVacias[i][j] = true;
				else
					casillasVacias[i][j] = false;
			}
		}
		return casillasVacias;
	}

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
				tablero[oldx][oldy] = ("||||");

			tablero[elegida.getPosicionX()][elegida.getPosicionY()] = representationShell(x, y,
					elegida.getRepresentacion());
		} else
			System.out.println("movimiento no posible");

		return tablero;
	}

	public static ArrayList<ArrayList<ArrayList<Piezas>>> checkStatus() {

		ArrayList<ArrayList<ArrayList<Piezas>>>piecillas=piezas;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 6; j++) {
				for (int z = 0; z < piecillas.get(i).get(j).size(); z++) {
				}
			}
		}
		return piecillas;
	}
	
	
	
	public static boolean busquedaRey(int i) {
		
		ArrayList<ArrayList<ArrayList<Piezas>>> piezas=checkStatus();
		boolean rey=true;
		if (piezas.get(i).get(5).size()==0) rey= false;
		return rey;
		
	}
	
	
	
	
	
	
	
	
	
}
