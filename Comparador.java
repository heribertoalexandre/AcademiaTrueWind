package dia1TrueWind;

import java.util.Comparator;

public class Comparador  implements Comparator<Integer> {

		@Override
		public int compare(Integer a, Integer b) {
			
			return a - b;
		}
}
