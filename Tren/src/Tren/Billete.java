package Tren;

import java.util.Date;

public class Billete {
private Date fecha = new Date();
private static int cont;
private  int id;
private int precio;
private Tren tren;
private Vagon Vagon;
private Asientos asiento;


public Billete(int precio) {
	cont++;
	this.id=cont;
	this.precio=precio;
}

}
