package principal;

public class Usuario {
	
	private int id;
	private String usuario, clave;
	
	public Usuario(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id =id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void save() {
		Conector con = new Conector();
		con.connect();
		con.saveUsuario(this);
	}
	

}
