package es.upm.examen;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClaseExamenTest {
	
	
	
	@Test
	public void n6 () throws EntradaInvalida {
		List<Integer> expected=new ArrayList<Integer>();
		
		expected.add(2);
		expected.add(3);
		
		assertTrue(expected.equals(ClaseExamen.primos(6)));
	}
	
	@Test
	public void n13 () throws EntradaInvalida {
				
		assertTrue(ClaseExamen.primos(13).isEmpty());
	}
	
	@Test(expected = EntradaInvalida.class)
	public void entrada_invalida () throws EntradaInvalida {
				
		ClaseExamen.primos(-1);
	}
	

}
