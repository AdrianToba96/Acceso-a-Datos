package Tren;

import java.util.HashMap;

public class Asientos {
	private static  int contador;
	private int id;

	private Asientos[] asientosList = new Asientos[10];
	private Billete billete;

	public Asientos() {
	contador++;
	this.id=contador;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
