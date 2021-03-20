package arrays_09;

import java.util.ArrayList;
import base.Conta;

public class ListasContas extends ArrayList {
	
	public Conta get(int idx) {
		return (Conta)this.get(idx);		
	}
	
	public void add(Conta conta) {
		this.add(conta);		
	}
}
