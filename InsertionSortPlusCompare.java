package dia1TrueWind;

import java.util.Comparator;

public class InsertionSortPlusCompare{
	
	static <T> void InsertionSort(T[] v, Comparator<T> comp) {
		
		for(int i = 1; i < v.length; i++) {	
			T aux = v[i];
			int j = i - 1;
			for(; j >= 0 && comp.compare(v[j],aux) > 0; j--)
				v[j+1] = v[j];
			v[j+1] = aux; 
		}
	}
}
