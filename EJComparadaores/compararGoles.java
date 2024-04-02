package EJComparadaores;

import java.util.Comparator;

public class compararGoles implements Comparator {
	public int compare(Object ob1, Object ob2) {
		Futbolista furbo1 = (Futbolista)ob1;
		Futbolista furbo2 = (Futbolista)ob2;
		
		if (furbo1.getGoles()==furbo2.getGoles()) {
			return furbo1.getNombre().compareTo(furbo2.getNombre());
		}
		else {
			return furbo1.getEdad()-furbo2.getEdad();
		}
	}
}
