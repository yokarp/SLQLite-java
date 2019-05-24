package principal;

public class Main {

	public static void main(String[] args) {

		Verificacion vf = new Verificacion();
		Conector con = new Conector();
		Ingreso ingresoUno = new Ingreso();
		
		vf.captcha();
		con.connect();
		ingresoUno.Ingresar();
		
	}

}
