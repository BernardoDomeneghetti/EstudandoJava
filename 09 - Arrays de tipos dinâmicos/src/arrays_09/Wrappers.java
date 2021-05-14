package arrays_09;

public class Wrappers {
	private Integer inteiro;
	
	public static void testaWrapper() {
		Wrappers wrp = new Wrappers();
		wrp.inteiro = 29;
		System.out.printf(
					"Inteiro criado com classe integer: %d", 
					wrp.inteiro
				);
	}

}
