package table;

import java.io.IOException;

public class LimpiarPantalla {

	public static void limpiar() throws InterruptedException, IOException{
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
}
