package ar.edu.utn.intermedio.java.ejer2;

import java.util.*;

public class ComparadorVelocidad implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		
		int cantidadRuedas1=o1.getCantidadDeRuedas();
		int veloMax1=o1.getVelocidadMaxima();
		
		int resultado1 =veloMax1 / cantidadRuedas1;
		
		int cantidadRuedas2=o2.getCantidadDeRuedas();
		int veloMax2=o2.getVelocidadMaxima();
		
		int resultado2 =veloMax2 / cantidadRuedas2;
		
		int resultadoFinal=0;
		
		if(resultado1 > resultado2) 
		{
			resultadoFinal=1;
		}
		
		if(resultado2 > resultado1) 
		{
			resultadoFinal=-1;
		}
		
		if(resultado1 == resultado2) 
		{
			resultadoFinal=0;
		}
		
		
		
		
		return resultadoFinal;
	}

	
	
	

}
