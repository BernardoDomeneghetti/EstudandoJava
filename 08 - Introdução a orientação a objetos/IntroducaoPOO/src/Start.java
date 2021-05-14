
public class Start {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.Fabricante = "Volkswagen";
		fusca.Modelo = "Fusca";
		fusca.NumPassageiros = 4;
		fusca.TanqueCombustivel = 30;
		fusca.ConsumoCombustivel = 0.15f;
		
		fusca.exibirAutonomia();

		System.out.println("A autonomia do fuscoso é: " + fusca.GetAutonomia());
		
		System.out.println("Para viajar 10km é necessário " + fusca.GetComustivel(10) + " litros" );
	}

}
