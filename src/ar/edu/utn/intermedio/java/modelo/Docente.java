package ar.edu.utn.intermedio.java.modelo;

public class Docente extends Persona {

	public Docente(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	
	private Integer codigoEmpleado;


	public Integer getCodigoEmpleado() {
		return codigoEmpleado;
	}


	public void setCodigoEmpleado(Integer codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}


	@Override
	public void identificarse() {
		
		super.identificarse();
		System.out.println("ID :" + this.codigoEmpleado + "  --->" + this.getNombre() +" " + this.getApellido());
		
	}

    


}
