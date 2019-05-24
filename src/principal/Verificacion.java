package principal;

import java.util.Scanner;

public class Verificacion {
	
	private String numeroLetra[] = {"CERO","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE"};
	private int numeroUno;
	private int numeroDos;
	

	public void captcha() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Para demostrar que no es un robot debe desarrollar el siguiente ejercicio");
		
		numeroDos = (int) (Math.random() * 9) + 1;
		
		for (int i = numeroDos; i < numeroLetra.length; i++) {
			  numeroUno = (int) (Math.random() * 9) + 1;
		      System.out.println(numeroLetra[i]+"+"+numeroUno+"=");
		      int respuesta = teclado.nextInt();
		      if(respuesta==i+numeroUno) {
		    	  System.out.println("Ingreso concedido");
		    	  break;
		      }else System.out.println("Eres un Robot");
		}
		
	}
		

}
