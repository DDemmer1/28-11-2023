package de.demmer.dennis;

public class Wiederholung {
	
	
	
	
	public static void main(String[] args) {
				
		// Erzeugung leeres Array
		String[] einkaufsliste = new String[5];
	
		//       0     1        2          3     4
		//   |      |     |  "Butter"  |     | "Mehl" | 
		
		              //  index 
		einkaufsliste[      2       ] = "Milch";
		einkaufsliste[4] = "Mehl";
		
		//Man kann Pläzte überschreiben
		einkaufsliste[2] = "Butter";
		
		
		
									//5
		for(int i = 0 ;  i < einkaufsliste.length; i++) {
			
			einkaufsliste[i] = "Mehl" + i;
			
			System.out.println(einkaufsliste[i]);
			
			
		}
		
		
		
		
		
		
		// Aufpassen das Plätze gefüllt sind wenn man Methoden verwendet
//		System.out.println(einkaufsliste[0].charAt(0));
		

		// Gefülltes Array
			   					    //0       1        2  
		String[] einkaufsliste2 = {"Milch","Butter","Eier"};
		einkaufsliste[0] = "Mehl";
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
