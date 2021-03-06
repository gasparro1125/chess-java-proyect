package Piezas;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;

public  abstract class  Piezas {
	
	private String pieza;
	private String color;
	private String representacion = "";
	private Integer posicionY;
	private Integer posicionX;

	public abstract Boolean move(Piezas p,int x,int y,ArrayList<ArrayList<ArrayList<Piezas>>> piezas,boolean[][] vacias);
	
	public Piezas(String pieza, String color ) {
		this.pieza = pieza;
		this.color = color;
		this.representacion = pieza + color;
	}
	
	
	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public String getRepresentacion() {
		return representacion;
	}

	public void setRepresentacion(String representacion) {
		this.representacion = representacion;
	}
	
	public Integer getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(Integer posicionY) {
		this.posicionY = posicionY;
	}



	public Integer getPosicionX() {
		return posicionX;
	}



	public void setPosicionX(Integer posicionX) {
		this.posicionX = posicionX;
	}

	private int contrey=0; 
		
	
	public int getContrey() {
		return contrey;
	}

	public void setContrey(int contrey) {
		this.contrey = contrey;
	}
	
	private int contTorre=0; 
		
	
	public int getcontTorre() {
		return contTorre;
	}

	public void setcontTorre(int conttorre) {
		this.contTorre = conttorre;
	}

	@Override
	public String toString() {
		return "Piezas [pieza=" + pieza + ", color=" + color + ", representacion=" + representacion + ", posicionX="
				+ posicionX + ", posicionY=" + posicionY + "]";
	}



	
	
}
