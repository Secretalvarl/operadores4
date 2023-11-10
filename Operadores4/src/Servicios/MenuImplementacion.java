package Servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int menuYSeleccion(Scanner sc){

        int seleccion;
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("  Selecciona una opción ");
        System.out.println("");
        System.out.println("");
        System.out.println("1. Cerrar ");
        System.out.println("2. igualdad ");
        System.out.println("3. desigualdad ");
        System.out.println("");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");

        seleccion = sc.nextInt();
        return seleccion;
	}

	public String pedirPalabras(Scanner sc) {

		System.out.println("Escribre una palabra");
		String palabras = sc.next();
		return palabras;
	}

}