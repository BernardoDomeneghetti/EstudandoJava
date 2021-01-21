package arrays_09;

import base.*;

public class ArraysContas {
	private ContaCorrente[] ccs;
	private int idxCcs;
	
	private ContaPoupanca[] cps;
	private int idxCps;
	
	private Conta[]cs;
	private int idxCs;
	
	private void anulaArray(Conta[] arrayContas) {		
		for (int j = 0; j < arrayContas.length; j++) {
			arrayContas[j] = null; 
		}
	}
	
	public ArraysContas() {		
		this.ccs = new ContaCorrente[5];
		anulaArray(ccs);
		idxCcs = 0;
		
		this.cps = new ContaPoupanca[5];
		anulaArray(cps);
		idxCps = 0;
		
		this.cs = new Conta[5];
		anulaArray(cs);
		idxCs = 0;
	}

	public void AddContaCorrente(ContaCorrente contaCorrente) {
		this.ccs[idxCcs] = contaCorrente;
		idxCcs++;
	}
	
	public void AddContaPoupanca(ContaPoupanca contaPoupanca) {
		this.cps[idxCps] = contaPoupanca;
		idxCps++;
	}
	
	public void AddConta(Conta conta) {
		this.cs[idxCs] = conta;
		idxCs++;
	}

	public ContaCorrente[] getCcs() {
		return this.ccs;
	}

	public ContaPoupanca[] getCps() {
		return this.cps;
	}

	public Conta[] getCs() {
		return this.cs;
	}
	
	public void printaContas() {
		System.out.println("Contas correntes:");
		for (ContaCorrente cc: ccs) {
			if (cc == null)
				continue;
			System.out.println(cc.toString());
		}
		
		System.out.println("Contas Poupancas:");
		for (ContaPoupanca cp: cps) {
			if (cp == null)
				continue;
			System.out.println(cp.toString());
		}
		
		System.out.println("Contas variadas:");
		for (Conta conta: cs) {
			if (conta == null)
				continue;
			System.out.println(conta.toString());
		}
	}
	
	
}
