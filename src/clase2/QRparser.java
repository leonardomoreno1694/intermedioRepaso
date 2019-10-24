package clase2;

public class QRparser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String qr = "mailto:mlennard.utn@gmail.com?subject=Asunto del mail&body=Un mensaje a la sociedad";
	
		System.out.println(qr.substring(0,6));
	
		
		//---------------------------------
		
		
		String a = "@";
		Integer index = qr.indexOf(a);
			
		
		if(index != -1) 
		{System.out.println("El Carater @ existe");}
		else if(index == -1) 
		{System.out.println("El Carater @ no existe");}
		
		//---------------------------------------------------------
		
		String b = "subject";
		Integer index2 = qr.indexOf(b);
			
		
		if(index2 != -1) 
		{System.out.println("El Carater subject existe ");}
		else if(index2 == -1) 
		{System.out.println("El Carater subject no existe");}
		
		
		//----------------------------------------------------------
		
		
		String c = "body=";
		Integer index3 = qr.indexOf(b);
		
		
		System.out.println(qr.substring(index3));
			
		
		
		
		
		 
		
		
	    
		

	}

}
