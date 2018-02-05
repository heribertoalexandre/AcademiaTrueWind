package dia1TrueWind;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestSorted {
	
	@Test
	void testIsOrdened() {
		int[] test1 = {1,2,3};
		boolean b = Aquecimento.isOrdened(test1);
		assertTrue(b);
		
		int[] test2 = {3,1,3};
		b = Aquecimento.isOrdened(test2);
		assertFalse(b);
		
	}
	
	@Test
	void testRandom() {
		int length = 10;
		int max = 5;
		
		int[] teste1 = Aquecimento.random(length, max);
		
		for(int i = 0; i < length; i++) {
			assertFalse(teste1[i] > max, i + ": " + teste1[i]);
		}
	}
	
	@Test
	void  TestMaxElementOfVector() {
		int[] vector = {1,5,2,7};
		
		
		int max = Aquecimento.maxElementOfVector(vector);
		
		assertEquals(7,max);
		
	}
	
	
	@Test
	void  TestMinElementOfVector() {
		int[] vector = {1,5,2,7};
			
		int min = Aquecimento.minElementOfVector(vector);
		
		assertEquals(1,min);
	
	}
	
	@Test
	
	void TestInsertionSort() {
		Integer[] test =  {4,1,2,8,7};
		Integer[] vetorOrdenado = {1,2,4,7,8};
		
		
		
		Aquecimento.InsertionSort(test);
		
		assertArrayEquals(vetorOrdenado, test);
		
	}
	
	void TestInsertionSortPlusCompare() {
		
		Integer[] teste = {1,5,2,9,4};
		Integer[] ordenado = {1,2,4,5,9};
		
		
		Comparador comp = new Comparador();
		
		InsertionSortPlusCompare.InsertionSort(teste, comp);
		
		assertArrayEquals(ordenado, teste);
		
	}
	
	
	
}
