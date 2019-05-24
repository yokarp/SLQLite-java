package principal;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Verificacion vf = new Verificacion();
		vf.captcha();
		Conector con = new Conector();
		con.connect();
		
		
		System.out.println("Ingresar 1 **** Registrarse 2");
		int opc = teclado.nextInt();
		
		if(opc==1) {
			System.out.println("Ingrese su usuario:");
			String usuario = teclado.next();
			System.out.println("Ingrese su contaseña:");
			String clave = teclado.next();
			
			//Ingresar
		}else if(opc==2) {
			System.out.println("Nombre de usuario:");
			String usuario = teclado.next();
			
			System.out.println("Clave: ");
			String clave = teclado.next();
			String claveE =DigestUtils.md5Hex(clave);
	
			Usuario usr = new Usuario(usuario,claveE);
			usr.save();
			
			System.out.println("!Usuario registrado con exito¡");
			//Registrar usuario
		}else System.err.println("Número o caracter invalido");
		
		
		con.mostrarUsuarios();
		

	}

}
