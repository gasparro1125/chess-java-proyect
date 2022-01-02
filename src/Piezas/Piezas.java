package Piezas;

import java.util.ArrayList;

public class  Piezas {
	
	private String pieza;
	private String color;
	private String representacion = "";
	private Integer posicionY;
	private Integer posicionX;

	
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



	@Override
	public String toString() {
		return "Piezas [pieza=" + pieza + ", color=" + color + ", representacion=" + representacion + ", posicionX="
				+ posicionX + ", posicionY=" + posicionY + "]";
	}



	
	
}
