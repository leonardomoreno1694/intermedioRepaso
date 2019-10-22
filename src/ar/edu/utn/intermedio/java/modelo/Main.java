package ar.edu.utn.intermedio.java.modelo;

public class Main {

	public static void main(String[] args) {
		
		
		 Persona p = new Persona("pedro","gonzales");
		 p.identificarse();
		 
		 
		 
         Alumno a = new Alumno("leonardo","moreno");
         a.setLegajo(3838);
         a.identificarse();
         
         Docente d = new Docente("martin","lennard");
         d.setCodigoEmpleado(4545);
         d.identificarse();
	}

}
