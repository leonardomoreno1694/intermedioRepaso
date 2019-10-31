package ar.edu.utn.intermedio.java.ejer2;

public class Moto extends Vehiculo implements Comparable<Moto>  {

	public Moto(String color, String marca, Integer cantidadDeRuedas) {
		super(color, marca, cantidadDeRuedas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer getCantidadDeRuedas() {
		
		
		Integer RuedasMoto = 2;
		return RuedasMoto;
			
	}

	@Override
	public int compareTo(Moto OtraMoto) {
		// TODO Auto-generated method stub
		int miVelocidad = getVelocidadMaxima();
		int velocidadOtraMoto = OtraMoto.getVelocidadMaxima();
		int cont=0;
		
		//POSITIVO  1 (moto mayor que el parametro)
		//NEGATIVO -1 (moto menor que el parametro)
		// IGUAL    0 (moto igual que el parametro) 
		
		if(velocidadOtraMoto < miVelocidad) {cont = 1;}
		else if(velocidadOtraMoto > miVelocidad) {cont = -1;}
		else if (velocidadOtraMoto==miVelocidad) {cont = 0;}
		
		
		
		return cont ;
	}
	
	
	
	
	
	

}
