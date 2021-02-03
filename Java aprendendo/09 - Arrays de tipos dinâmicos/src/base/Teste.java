package base;

import arrays_09.ArraysContas;
import arrays_09.ListasContas;

public class Teste {
	public static void main(String[] args) {
		ArraysContas arrCs = new ArraysContas();
		arrCs.AddContaCorrente(new ContaCorrente(1000, "Bernardo", 1, 1000));
		arrCs.printaContas();
		
		
		ListasContas lstCs = new ListasContas();
		lstCs.add(new ContaCorrente(1000, "Bernardo", 1, 1000));
		lstCs.add(new ContaCorrente(1000, "Eduarda", 1, 1000));
		
		System.out.println(lstCs.toString());
		
		
	}
}
