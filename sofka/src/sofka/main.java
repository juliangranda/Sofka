package sofka;

import java.util.Scanner;

public class main {

	

	public static void main(String[] args) {
		
		//EJERCICIO 1
		int numeroDias = 0;
		int distanciaRecorrida = 0;
		int pasaje = 0;
		float descuento = 0;
		int precioKilometro  = 35;
		int precioDescuento = 0;
		int precioKm = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese el numero de dias de su estancia: ");
		numeroDias = scanner.nextInt();
		System.out.println("ingrese la distancia a recorrer del avion");
		distanciaRecorrida = scanner.nextInt();

		
		if(distanciaRecorrida > 1000 && numeroDias > 7) {
			descuento = 30;
		}
		

		precioKm = (distanciaRecorrida * 35);
		precioDescuento = ((int) (precioKm * (descuento/100)));
		pasaje =  precioKm - precioDescuento;
		System.out.println();
		
		System.out.println("numero de dias:" + numeroDias);
		System.out.println("distancia recorrida:" + distanciaRecorrida +"km");
		System.out.println("descuento de la linea:" + descuento +"%");
		System.out.println("precio descuento" + precioDescuento);
		System.out.println("precioKm es:" + precioKm);
		System.out.println("el costo del pasaje es: " + pasaje);
		
		
		
		
	}

}
