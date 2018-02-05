package dia1TrueWind;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Aquecimento {
	public static void  main(String arg[]) {
		
		Integer[] test =  randomPlus(10,0,10);
		
		
		InsertionSort(test);
		
		
		
	}
	
	public static Integer [] random(int length, int max) {
		
		Integer[] vector = new Integer[length];
		
		for(int times = 0; times < length; times++) {	
			double randomDouble  = Math.random();
			int randomInteger = (int)(randomDouble * (max + 1));
			vector[times] = randomInteger;
		}
		
		return vector;
	}
	
	public static Integer [] randomPlus(int length, int min, int max) {
		
		Integer[] vector = new Integer[length];
		Random seed = new Random(max);
		
		
		
		for(int times = 0; times < length; times++) {	
			
			int randomFinal = seed.nextInt((max - min) + 1) + min;
			vector[times] = randomFinal;
		}
		
		return vector;
	}
	
	public static boolean isOrdened(int[] v) {
	
		
		for(int i = 0; i < v.length - 1; i++) {
			if(v[i] > v[i+1])
				return false;
		}
		return true;
	}
	
public static boolean isOrdened2(Integer[] v) {
	
		
		for(int i = 0; i < v.length - 1; i++) {
			if(v[i] > v[i+1])
				return false;
		}
		return true;
	}
	public static int maxElementOfVector(int[] vector) {
		
		int max = vector[0];
		
		for(int i = 1; i < vector.length; i++) {
			if(vector[i] > max)
				max = vector[i];
		}
		return max;	
	}
	
	public static int minElementOfVector(int[] vector) {
			
			int min = vector[0];
			
			for(int i = 1; i < vector.length; i++) {
				if(vector[i] < min)
					min = vector[i];
			}
			return min;	
	}
	
	
	
	public static void invert(int[] v) {
		
		for(int i = 0; i < v.length / 2; i++) {
			int temp = v[i];
			v[i] = v[v.length-1-i];
			v[v.length-1-i] = temp; 
			
		}
	}
	
	public static void InsertionSort (Integer[] v) {
		
		for(int i = 1; i < v.length; i++) {	
			int aux = v[i];
			int j = i - 1;
			for(; j >= 0 && v[j] > aux; j--)
				 v[j + 1] =  v[j];
				
			v[j+1] = aux; 
		}
	}
	
	

}