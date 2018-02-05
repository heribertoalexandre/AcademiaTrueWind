package dia1TrueWind;

import java.util.Comparator;

public class SelectionSort {

		
	static <T> void selectionSort(T[] v, Comparator<T> comp) {
		
		assert v != null : "vetor nulo";
		assert v.length > 0 : "tamanho invalido";
		
		for(int i = 0; i < v.length; i++) {
			int minIndex = minOfArray(v,i,comp);
			swap(i,minIndex,v);
			
		}
	}
	
	public static <T> int minOfArray(T[] v, int start, Comparator<T> comp) {
	
		int indexMin = start;
		
		for(int i = start; i < v.length; i++) {
			if(comp.compare(v[i],v[indexMin]) < 0)
				indexMin = i;
		}
		
		return indexMin;
	}
	
	static void swap ( int i, int j, Object[] v) {
		Object temp =  v[i];
		v[i] = v[j];
		v[j] = temp;
	
	}
}
