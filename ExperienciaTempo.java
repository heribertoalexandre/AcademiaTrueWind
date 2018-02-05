package dia1TrueWind;

public class ExperienciaTempo {

	public static void main(String[] args) {
		
		//Selection
		
		long timeSelectionSortFirst = System.currentTimeMillis();
		Integer[] array = Aquecimento.random(10000, 100);
		Comparador comp = new Comparador();
		
		SelectionSort.selectionSort(array, comp);
		timeSelectionSortFirst = System.currentTimeMillis() - timeSelectionSortFirst ;
		
		System.out.println("Ordena��o Selection 1" + timeSelectionSortFirst);
		
		long timeSelectionSortSecond = System.currentTimeMillis();
		SelectionSort.selectionSort(array, comp);
		timeSelectionSortSecond = System.currentTimeMillis() - timeSelectionSortSecond;
		
		System.out.println("Ordena��o Selection j� ordenado: " + timeSelectionSortSecond);

		//Insertion
		
		Integer[] array2 = Aquecimento.random(10000, 100);
		
		long timeInsertionSortFirst = System.currentTimeMillis();
	
		
		InsertionSortPlusCompare.InsertionSort(array2, comp);
		
		timeInsertionSortFirst = System.currentTimeMillis() - timeInsertionSortFirst;
		
		System.out.println("Ordena��o Insertion 1" + timeInsertionSortFirst);
		
		long timeInsertionSortSecond = System.currentTimeMillis();
		SelectionSort.selectionSort(array2, comp);
		timeInsertionSortSecond = System.currentTimeMillis() - timeInsertionSortSecond ;
		
		System.out.println("Ordena��o Insertion j� ordenado : " + timeInsertionSortSecond);
		
		
	}
}
