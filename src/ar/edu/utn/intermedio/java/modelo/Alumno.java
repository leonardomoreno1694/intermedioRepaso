package ar.edu.utn.intermedio.java.modelo;

public class Alumno extends Persona {
	
	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	private Integer legajo;

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	@Override
	public void identificarse() {
		
		super.identificarse();
		System.out.println("legajo:" + this.legajo + "  --->" + this.getNombre() +" " + this.getApellido());
	}
	

}
