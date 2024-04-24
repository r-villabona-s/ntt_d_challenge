package ntt.data.challenge.entity;

public class Cliente {

	private String nombre1;
	private String nombre2;
	private String apellido1;
	private String apellido2;

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudadResid() {
		return ciudadResid;
	}

	public void setCiudadResid(String ciudadResid) {
		this.ciudadResid = ciudadResid;
	}

	private String telefono;
	private String ciudadResid;

}
