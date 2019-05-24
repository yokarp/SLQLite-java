package principal;

import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

public class Ingreso {

	Scanner teclado = new Scanner(System.in);
	
    public void Ingresar() {
    	
	while(true) {
		System.out.println("| Ingresar 1 |*| Registrarse 2 |*| Salir 3 |");
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
						}else if(opc==3)System.exit(0);
				           else System.err.println("Número o caracter invalido");
		}
    }
	//con.mostrarUsuarios();
	
}
