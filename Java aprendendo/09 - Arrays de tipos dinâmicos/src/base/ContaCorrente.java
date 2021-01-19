package base;

public class ContaCorrente extends Conta{
	
	private float limite;
	
	public ContaCorrente(float saldo, String cliente, int numeroConta, float limite) {
		super(saldo, cliente, numeroConta);
		this.limite = limite;
	}
	
	@Override
	public void Saque(float valorSaque) throws Exception {
		if (valorSaque > this.limite + this.getSaldo())
			throw new Exception("Valor do saque ultrapassa os valores do saldo e limite");
	}
}
