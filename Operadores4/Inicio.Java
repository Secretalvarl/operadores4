
package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MenuInterfaz mi = new MenuImplementacion();
		
		boolean cerrarMenu = false;
		
		while (!cerrarMenu) {

			int seleccion = mi.menuYSeleccion(sc);
			switch(seleccion) {
			
			case 1:
				cerrarMenu = true;
				break;
				
			case 2:
				String palabra = mi.pedirPalabras(sc);
				String palabra. = mi.pedirPalabras(sc);
				if (palabraUno.equals(palabraDos)) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				break;
				
			case 3:
				String palabraUno = mi.pedirPalabras(sc);
				String palabraDos = mi.pedirPalabras(sc);
				if (palabraUnoD.equals(palabraDosD)) {
					System.out.println("false");
				}else {
					System.out.println("true + "");
				}
				break;
			default:
				break;
			}
		}

	}
}