package base;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(float saldo, String cliente, int numeroConta) {
		super(saldo, cliente, numeroConta);
	}

	@Override
	public String toString() {
		return String
					.format(
						"Numero: %d Cliente: %s Saldo: %.2f", 
						this.getNumeroConta(),
						this.getCliente(),
						this.getSaldo()
					);
	}	
}
