package Tren;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Vagon {
private static int cont;
private  int id;
private String ocupados ="";
private Billete billete;
private Asientos asientos[];


public Vagon() {
	this.asientos = new Asientos[10];
//this.asientos=crearAsientos();	
}
public void listarAsientosOcupados() {
	System.out.print("Los asientos ocupados son ");
	for (int i = 0; i < asientos.length; i++) {
		if (asientos[i]!=null) {
			System.out.print((i) + " ");
		}
	}
	
}
public Asientos[] crearAsientos() {
	Asientos generador[] = new Asientos[10];
	Random rm = new Random();
	for (int i = 0; i < generador.length; i++) {
		if (rm.nextInt(1)==1) {
			Asientos a = new Asientos();
			generador[i]= a;
		}else {
			generador[i]=null;
		}
	}
	return generador;
	
}
public Boolean isfull() {
	
	for (int i = 0; i < asientos.length; i++) {
		if (asientos[i]==null) {
			return false;
		}
	}
	return true;
}
public void imprimirAsiento() {
	System.out.print("Los asientos vacios son ");
	for (int i = 0; i < asientos.length; i++) {
		if (asientos[i]==null) {
			System.out.print((i) + " ");
		}
	}
	}

public Asientos[] getAsientos() {
	return asientos;
}

public void setAsientos(Asientos[] asientos) {
	this.asientos = asientos;
}



}
