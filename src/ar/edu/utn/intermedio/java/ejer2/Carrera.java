package ar.edu.utn.intermedio.java.ejer2;
import java.util.*;

public class Carrera {

	public static void main(String[] args) {
		
		ArrayList<Moto> listaMotos = new ArrayList();
		
		Moto moto1 = new Moto("negro","gilera",2);
		listaMotos.add(moto1);
		
		Moto moto2 = new Moto("rojo","kimko",2);
		listaMotos.add(moto2);
		
		Moto moto3 = new Moto("negro","motomel",2);
		listaMotos.add(moto3);
		
		
		
		Scanner scanner = new Scanner(System.in);		
		for(Moto moto : listaMotos)
		{
			System.out.println("ingrese velocidad de "+moto.getMarca()+":");
			moto.setVelocidadMaxima(scanner.nextInt());	
			System.out.println("Metros Avanzados: " + moto.avanzar(120));
			
		}		
		//MAX_VALUE devolvera un numero maximo muy alto
		Integer minimo = Integer.MAX_VALUE; // listaMotos.get(0).getVelocidadMaxima();
		
		
		String masLenta="";
		
		for (Moto moto : listaMotos) 
		{
			float c = moto.avanzar(1200);
			
			if(c== Math.min(minimo, c)) 
			{
				minimo =(int) c;
				masLenta = moto.getMarca();
				
			}
			
			
		}
		
		System.out.println("la moto mas lenta es "+ masLenta);
		
		

	}

}
