package base;

public abstract class Conta {
	private float saldo;
	private String cliente;
	private int numeroConta;
	
	public abstract String toString();
	
	public Conta(){
		super();
	}
		
	public Conta(float saldo, String cliente, int numeroConta) {
		super();
		this.saldo = saldo;
		this.cliente = cliente;
		this.numeroConta = numeroConta;
	}

	public void Deposita(float valorDeposito) throws Exception {
		if (valorDeposito <= 0) 
			throw new Exception("Impossível depositar valores menores ou iguais a zero");
		
		this.saldo = this.saldo + valorDeposito;
	}
	
	public void Saque (float valorSaque) throws Exception{
		if (valorSaque > this.saldo)
			throw new Exception("Valor do depósito ultrapassa o saldo atual da contaz");
		
		this.saldo = saldo - valorSaque;
			
	}
	
	public float getSaldo() {
		return saldo;
	}
	public String getCliente() {
		return cliente;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	
	
}
