package arrays_09;

import java.util.ArrayList;

import base.Conta;

public class IntroducaoGenerics {
	private ArrayList<Conta> lsContas;

	public IntroducaoGenerics() {
		super();
		this.lsContas = new ArrayList<Conta>();
	}

	public ArrayList<Conta> getLsContas() {
		return lsContas;
	}

	public void setLsContas(ArrayList<Conta> lsContas) {
		this.lsContas = lsContas;
		
	}
	
	
}
