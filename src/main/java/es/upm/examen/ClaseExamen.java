package es.upm.examen;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	
	
	public static List<Integer> primos (int n) throws EntradaInvalida{
		
		if (n<1) throw new EntradaInvalida();
		
		List<Integer> resultado=new ArrayList<Integer>();
		
		for(int i=2; i<n; i++) {
			System.out.println(n+"%" + i + "=" +n%i);
			if (n%i==0)
				resultado.add(i);
			
		}
		
		return resultado;
	}
}
