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

		if (selecionada.getPosicionX() == x || selecionada.getPosicionY() == y) {
			if (selecionada.getPosicionX() != x) {

				if (x < selecionada.getPosicionX()) {

					for (int i = x; i < selecionada.getPosicionX(); i++) {
						if (vacias[i][y] == true) {
							checks.add(true);
						} else
							checks.add(true);

					}
				} else {
					for (int i = x; selecionada.getPosicionX() < i; i--) {
						if (vacias[i][y] == true) {
							checks.add(true);
						} else
							checks.add(true);
					}
				}
			} else {

				if (y < selecionada.getPosicionY()) {

					for (int i = y; i < selecionada.getPosicionY(); i++) {
						if (vacias[x][i] == true) {
							checks.add(true);
						} else
							checks.add(true);
					}
				} else {
					for (int i = y; selecionada.getPosicionY() < i; i--) {
						if (vacias[x][i] == true) {
							checks.add(true);
						} else
							checks.add(true);
					}
				}
			}
		} else {
			if (x < selecionada.getPosicionX()) {
				if (y > selecionada.getPosicionY()) {
					for (int i = x,  j = y ; i < selecionada.getPosicionX() && j > selecionada.getPosicionY(); i++,j--) {
						//for (int j = y; j > selecionada.getPosicionY(); j--) {
							if ((selecionada.getPosicionX() - i) == (j - selecionada.getPosicionY())) {
								if (vacias[i][j] == true)
									checks.add(false);
								else {
									checks.add(true);
								}
							//}
						}else checks.add(true);
					}
				} else if (y < selecionada.getPosicionY()) {
					for (int i = x, j=y; i < selecionada.getPosicionX() && j < selecionada.getPosicionY() ; i++,j++) {
						//for (int j = y; j < selecionada.getPosicionY(); j++) {
							if ((selecionada.getPosicionX() - i) == (selecionada.getPosicionY() - j)) {
								if (vacias[i][j] == true)
									checks.add(false);
								else {
									checks.add(true);
								}
							}else checks.add(true);
						//}
					}
				}
			} else if (x > selecionada.getPosicionX()) {
				if (y > selecionada.getPosicionY()) {
					for (int i = x ,  j=y; i > selecionada.getPosicionX() && j > selecionada.getPosicionY(); i--,j--) {
						//for (int j = y; j > selecionada.getPosicionY(); j--) {
							if ((i - selecionada.getPosicionX()) == (j - selecionada.getPosicionY())) {
								if (vacias[i][j] == true)
									checks.add(false);
								else {
									checks.add(true);
								}
							}else checks.add(true);
						//}
					}
				} else if (y < selecionada.getPosicionY()) {
					for (int i = x, j=y; i > selecionada.getPosicionX() && j < selecionada.getPosicionY(); i--,j++) {
						//for (int j = y; j < selecionada.getPosicionY(); j++) {
							if ((i - selecionada.getPosicionX()) == (selecionada.getPosicionY() - j)) {
								if (vacias[i][j] == true)
									checks.add(false);
								else {
									checks.add(true);
								}
							}else checks.add(true);
						//}
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

		//System.out.println("obstaculos = " + check);
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
			return false;
		} else
			return true;
	}

	public boolean exixtVictim(Piezas selectionada, int x, int y, ArrayList<ArrayList<ArrayList<Piezas>>> piezas) {
		boolean check = false;
		Piezas objective = recorrerPiezas(x, y, piezas);

		if (objective == null)
			return check;
		else if (objective.getColor() != selectionada.getColor())
			check = true;

		//System.out.println("hay victima = " + check);
		return check;

	}

	public boolean ataque(Piezas selectionada, int x, int y, boolean[][] vacias) {
		boolean check = false;
		boolean existobstaculos = true;
		
		if (selectionada.getPosicionX() == x || selectionada.getPosicionY() == y) {
			if (x != selectionada.getPosicionX()) {
				if (x < selectionada.getPosicionX()) {
					existobstaculos = true;
				} else
					existobstaculos = true;
			} else {
				if (y < selectionada.getPosicionY()) {
					existobstaculos = true;
				} else
					existobstaculos = true;
			}
		} else {
			if (x < selectionada.getPosicionX()) {
				if (y > selectionada.getPosicionY()) {
					existobstaculos = obstaculos(selectionada, x + 1, y - 1, vacias);
				} else if (y < selectionada.getPosicionY()) {
					existobstaculos = obstaculos(selectionada, x + 1, y + 1, vacias);
				}

			} else {
				if (y > selectionada.getPosicionY()) {
					existobstaculos = obstaculos(selectionada, x - 1, y - 1, vacias);
				} else if (y < selectionada.getPosicionY()) {
					existobstaculos = obstaculos(selectionada, x - 1, y + 1, vacias);
				}

			}
		}
		if (existobstaculos != true)check = true;
		else check=false;
		//System.out.println("ataque = " + check);
		return check;

	}

	public boolean ataqueAlfil(Piezas selectionada, int x, int y, ArrayList<ArrayList<ArrayList<Piezas>>> piezas,
			boolean[][] vacias) {
		if (exixtVictim(selectionada, x, y, piezas) == true && ataque(selectionada, x, y, vacias) == true)
			return true;
		else
			return false;
	}

	public Boolean move(Piezas selectionada, int x, int y, ArrayList<ArrayList<ArrayList<Piezas>>> piezas, boolean[][] vacias) {
		boolean check = false;
		boolean ataque = ataqueAlfil(selectionada, x, y, piezas,vacias);
		
		if (x <= 7 && x >= 0 && y <= 7 && y >= 0) {
			
			if( isNotFriend(selectionada, x, y, piezas)==true && ataque==true ) {
				check =true;
			}
			
			
			else if (isNotFriend(selectionada, x, y, piezas) == true && ataque==false) {
				if (obstaculos(selectionada, x, y, vacias) == false) {
					
					
					if (selectionada.getPosicionX() == x || selectionada.getPosicionY() == y) {
						check = false;
					}else if (selectionada.getPosicionX() != x && selectionada.getPosicionY() != y) {
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
					}return check;
				}else return check;
			} else
				return check;
		}
		//System.out.println(check);
		return check;
	}

}
