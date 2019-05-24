package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conector {
	
	String url ="/home/yokar/nuevo";
	Connection connect; 
	
	public void connect() {
		try {
			connect = DriverManager.getConnection("jdbc:sqlite:"+url);
			if(connect!=null) {
				System.out.println("*");
			}
			
		}catch(SQLException ex){
			System.err.println("No se a podido conectar a la base de datos\n"+ex.getMessage());
		}
	}

	/*public void close() {
		try {
			connect.close();
		}catch(SQLException ex) {
			Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null,ex);
		}
	}*/
	
	public void saveUsuario(Usuario usuario) {
		
		try {
			PreparedStatement st = connect.prepareStatement("insert into login(usuario,clave) values (?,?)");
				st.setString(1, usuario.getUsuario());
				st.setString(2, usuario.getClave());
				st.execute();
		}catch(SQLException ex) {
			System.err.println(ex.getMessage());
		}
		
	}
	
	public void mostrarUsuarios() {
		ResultSet result = null;
		try {
			PreparedStatement st = connect.prepareStatement("select *from login");
			result = st.executeQuery();
			while(result.next()) {
				System.out.print("ID: ");
				System.out.println(result.getInt("id"));
				
				System.out.print("Usuario: ");
				System.out.println(result.getString("usuario"));
				
				System.out.print("Clave: ");
				System.out.println(result.getString("clave"));
				
				System.out.println("===================");
			}
		}catch(SQLException ex) {
			System.err.println(ex.getMessage());
		}
	}
	

}
