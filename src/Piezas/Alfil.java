package Piezas;

import java.util.ArrayList;
import java.util.Iterator;

public class Alfil extends Piezas {
	public Alfil(String pieza, String color) {
		super(pieza, color);
	}

	public static boolean obstaculos(Piezas selecionada, int x, int y, boolean[][] vacias) {
		ArrayList<Boolean> checks = new ArrayList<Boolean>();
		boolean check = true;
		int obsta = 0;

		if (x < selecionada.getPosicionX()) {
			if (y > selecionada.getPosicionY()) {
				for (int i = x; i < selecionada.getPosicionX(); i++) {
					for (int j = y; j > selecionada.getPosicionY(); j--) {
						if ((selecionada.getPosicionX() - i) == (j - selecionada.getPosicionY())) {
							if (vacias[i][j] == true)
								checks.add(false);
							else {
								checks.add(true);
							}
						}
					}
				}
			} else if (y < selecionada.getPosicionY()) {
				for (int i = x; i < selecionada.getPosicionX(); i++) {
					for (int j = y; j < selecionada.getPosicionY(); j++) {
						if ((selecionada.getPosicionX() - i) == (selecionada.getPosicionY() - j)) {
							if (vacias[i][j] == true)
								checks.add(false);
							else {
								System.out.println("aumento1");
								checks.add(true);
							}
						}
					}
				}
			}
		} 
		else if (x > selecionada.getPosicionX()) {
			if (y > selecionada.getPosicionY()) {
				for (int i = x; i > selecionada.getPosicionX(); i--) {
					for (int j = y; j > selecionada.getPosicionY(); j--) {
						if ((i - selecionada.getPosicionX()) == (j - selecionada.getPosicionY())) {
							if (vacias[i][j] == true)
								checks.add(false);
							else {
								checks.add(true);
							}
						}
					}
				}
			} else if (y < selecionada.getPosicionY()) {
				for (int i = x; i > selecionada.getPosicionX(); i--) {
					for (int j = y; j < selecionada.getPosicionY(); j++) {
						if ((i - selecionada.getPosicionX()) == (selecionada.getPosicionY() - j)) {
							if (vacias[i][j] == true)
								checks.add(false);
							else {
								checks.add(true);
							}
						}
					}
				}
			}
		}
		

		for (Boolean boolean1 : checks) {
			if (boolean1 == true)
				obsta++;
		}

		if (obsta == 0)
			check = false;

		System.out.println("obstaculos = " + check);
		System.out.println(obsta);
		return check;
	}

	public Piezas recorrerPiezas(int x, int y, ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
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

	public boolean isNotFriend(Piezas selectionada, int x, int y, ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
		Piezas objective = recorrerPiezas(x, y, piezas);
		if (objective == null)
			return true;
		else if (objective.getColor() == selectionada.getColor()) {
			System.out.println("Heyy");
			return false;
		} else
			return true;
	}

	public Boolean move(Piezas selectionada, int x, int y, ArrayList<ArrayList<ArrayList<Piezas>>> piezas,
			boolean[][] vacias) {
		boolean check = false;

		if (x <= 7 && x >= 0 && y <= 7 && y >= 0) {

			if (isNotFriend(selectionada, x, y, piezas) == true) {
				if (obstaculos(selectionada, x, y, vacias) == false) {
					if (x < selectionada.getPosicionX()) {
						if (y > selectionada.getPosicionY()) {
							if ((selectionada.getPosicionX() - x) == (y - selectionada.getPosicionY())) {
								return check = true;
							}
						} else if (y < selectionada.getPosicionY()) {
							if ((selectionada.getPosicionX() - x) == (selectionada.getPosicionY() - y)) {
								return check = true;
							}
						}
					} else if (x > selectionada.getPosicionX()) {
						if (y > selectionada.getPosicionY()) {
							if ((x - selectionada.getPosicionX()) == (y - selectionada.getPosicionY())) {
								return check = true;
							}
						} else if (y < selectionada.getPosicionY()) {
							if ((x - selectionada.getPosicionX()) == (selectionada.getPosicionY() - y)) {
								return check = true;
							}
						}
					}
				}
			} else
				return check;
		}
		return check;
	}

}
