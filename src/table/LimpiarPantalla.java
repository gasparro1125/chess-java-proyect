package table;

import java.io.IOException;

public class LimpiarPantalla {
		public static void limpiar() throws InterruptedException, IOException{
	        try {

	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

	        } catch (Exception e) {

	            /*No hacer nada*/

	        }
	}
}
