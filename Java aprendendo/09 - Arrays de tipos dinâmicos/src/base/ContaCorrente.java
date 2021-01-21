package base;

public class ContaCorrente extends Conta{
	
	private float limite;
	
	public ContaCorrente(){
		super();
	}
	
	public ContaCorrente(float saldo, String cliente, int numeroConta, float limite) {
		super(saldo, cliente, numeroConta);
		this.limite = limite;
	}
	
	@Override
	public void Saque(float valorSaque) throws Exception {
		if (valorSaque > this.limite + this.getSaldo())
			throw new Exception("Valor do saque ultrapassa os valores do saldo e limite");
	}

	@Override
	public String toString() {
		return String.format(
						"Numero: %d Cliente: %s Saldo: %.2f Limite %.2f ", 
						this.getNumeroConta(),
						this.getCliente(), 
						this.getSaldo(),
						this.getSaldo()
					);	
	}
}
