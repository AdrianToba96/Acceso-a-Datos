package Tren;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Estacion {

	public static void main(String[] args) {
		Random rm = new Random();
		Tren tren1 = new Tren();
		Asientos asientos = new Asientos();
		Tren tren2 = new Tren();
		Tren tren3 = new Tren();
		do {
			System.out.println("1- Venta de billetes");
			System.out.println("2- Anular billetes");
			System.out.println("3- Asientos vendidos");

			Scanner sc = new Scanner(System.in);
			int opcion = sc.nextInt();
			
			
			//Este es el switch generico			
			switch (opcion) {
			case 1: {
				Billete billete = new Billete(rm.nextInt(100));
				System.out.println("En que tren quieres que se añada este billete: 1, 2 o 3");
				opcion = sc.nextInt();
				//este es el switch de la opcion1
				switch (opcion) {
				case 1: {
					if (tren1.getVagones().get(tren1.getVagones().size() - 1).isfull()) {
						tren1.otroVagon();
					}
					tren1.getVagones().get(tren1.getVagones().size() - 1).imprimirAsiento();
					System.out.println(
							"Dime cual compro, no me introduzcas un dato mal que no lo he comprobado, por favor");
					tren1.getVagones().get(tren1.getVagones().size() - 1).getAsientos()[sc.nextInt()] = new Asientos();
					break;
				}

				case 2: {
					if (tren2.getVagones().get(tren2.getVagones().size() - 1).isfull()) {
						tren2.otroVagon();
					}
					tren2.getVagones().get(tren2.getVagones().size() - 1).imprimirAsiento();
					System.out.println(
							"Dime cual compro, no me introduzcas un dato mal que no lo he comprobado, por favor");
					tren2.getVagones().get(tren2.getVagones().size() - 1).getAsientos()[sc.nextInt()] = new Asientos();
					break;
				}
				case 3: {
					if (tren3.getVagones().get(tren3.getVagones().size() - 1).isfull()) {
						tren3.otroVagon();
					}
					tren3.getVagones().get(tren3.getVagones().size() - 1).imprimirAsiento();
					System.out.println("Dime cual compro, no me introduzcas un dato mal que no lo he comprobado, por favor");
					tren3.getVagones().get(tren3.getVagones().size() - 1).getAsientos()[sc.nextInt()] = new Asientos();
					break;
				}
					
				}
				break;
			}//aqui acaba el switch de la opcion1
			case 2: {
			 int borrarVagon;
				System.out.print("Los billetes ocupados son");
					for (int i = 0; i < tren1.getVagones().size(); i++) {
						System.out.println("El  vagon " + i + " tiene los siguientes asientos ocupados: ");
						tren1.getVagones().get(i).listarAsientosOcupados();
					}
					System.out.println("Dime el vagon del cual cancelo, no me introduzcas un dato mal que no lo he comprobado, por favor");
					borrarVagon=sc.nextInt();
					System.out.println("Que asiento quieres eliminar, no me introduzcas un dato mal que no lo he comprobado, por favor");
					tren1.getThisVagon(borrarVagon).getAsientos()[sc.nextInt()]=null;
				break;
			}
			case 3: {

				break;
			}
			}
		} while (true);

	}
}