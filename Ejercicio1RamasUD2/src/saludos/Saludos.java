package saludos;

import java.util.Scanner;

public class Saludos {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Su nombre es: ");
		String nombre = input.nextLine();
	
		System.out.println("Su apellido es: ");
		String apellido = input.nextLine();
		
		System.out.println("Hola " + nombre + " " + apellido);
		
		
		input.close();
	}

}
