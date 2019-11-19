package aplicacao;

import java.util.Arrays;

public class Programa {

	public static void main(String[] args) {
		
		Integer aI[] = {-2, 4, 7, 10, 8, 5, 1, -1};
		Double aD[] = {-2.6, 4.4, 7.8, 9.5, 8.6, 5.7, 1.3, -1.9};
		
		System.out.println("Maior Integer: " + maior(aI) + " de " + Arrays.toString(aI));
		System.out.println("Maior Double: " + maior(aD) + " de " + Arrays.toString(aD));
	}
	
	public static Integer maior (Integer array[]) { //Método sobrecarregado
		Integer maior = array[0];
		for (Integer elemento: array)
			if (maior.compareTo(elemento)<0)
				maior = elemento;
		return maior;
	}
	
	public static Double maior (Double array[]) { //Método sobrecarregado
		Double maior = array[0];
		for (Double elemento: array)
			if (maior.compareTo(elemento)<0)
				maior = elemento;
		return maior;
	}
}
