package base;

import arrays_09.ArraysContas;

public class Teste {
	public static void main(String[] args) {
		ArraysContas arrCs = new ArraysContas();
		arrCs.AddContaCorrente(new ContaCorrente(1000, "Bernardo", 1, 1000));
		arrCs.printaContas();
	}
}
