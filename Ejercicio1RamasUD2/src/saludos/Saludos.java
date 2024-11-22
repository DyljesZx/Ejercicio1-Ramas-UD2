package saludos;

import java.util.Scanner;

public class Saludos {
    
    public static final int HORA = 12; 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    	
    	
    	System.out.println("Inserte su hora actual sin los minutos: ");
    	
    	int HORA = input.nextInt();
    	
        if (HORA >= 6 && HORA < 12) {
            System.out.println("¡Buenos días!");
        } else if (HORA >= 12 && HORA < 18) {
            System.out.println("¡Buenas tardes!");
        } else if (HORA >= 18 && HORA < 24) {
            System.out.println("¡Buenas noches!");
        } else if (HORA >= 0 && HORA < 6) {
            System.out.println("¡Buena madrugada!");
        } else {
            System.out.println("Hora no válida");
        }
        
        
        
        input.close();
    }
}

