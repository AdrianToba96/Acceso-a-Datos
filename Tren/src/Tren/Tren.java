package Tren;

import java.util.ArrayList;
import java.util.Date;

public class Tren {
private int id;
private String horaSalida, estacionSalida;
private ArrayList <Vagon> vagones = new ArrayList();
private Date fechaSalida;

public Tren() {
this.vagones.add(new Vagon());	
}
public Tren(String horaSalida, String estacionSalida) {

}
public void otroVagon(){
	vagones.add(new Vagon());
	
}
public Vagon getThisVagon(int id) {
	
	return vagones.get(id);
}

public ArrayList<Vagon> getVagones() {
	return vagones;
}
public void setVagones(ArrayList<Vagon> vagones) {
	this.vagones = vagones;
}
public String getHoraSalida() {
	return horaSalida;
}
public void setHoraSalida(String horaSalida) {
	this.horaSalida = horaSalida;
}
public String getEstacionSalida() {
	return estacionSalida;
}
public void setEstacionSalida(String estacionSalida) {
	this.estacionSalida = estacionSalida;
}
@Override
public String toString() {
	return " El tren numero " + id + " salio de " + estacionSalida + " a las " + horaSalida + " con "
			+ vagones + "]";
}


}
