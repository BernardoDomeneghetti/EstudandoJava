
public class Carro {
	String Modelo;
	String Fabricante;
	String Cor;
	int NumPassageiros;
	double TanqueCombustivel;
	float ConsumoCombustivel;
	
	void exibirAutonomia() {
		System.out.print("A autonomia atual é: ");
		System.out.println(this.ConsumoCombustivel * this.TanqueCombustivel);
	}
	
	double GetAutonomia(){
		return this.TanqueCombustivel * this.ConsumoCombustivel;
	}
	
	double GetComustivel(float km) {
		return km/this.ConsumoCombustivel;
	}
	
}
