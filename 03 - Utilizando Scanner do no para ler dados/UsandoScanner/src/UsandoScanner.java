import java.util.Scanner;

public class UsandoScanner {	 
	String nome; 
	String seila;
	int idade;
	float preco;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		UsandoScanner teste = new UsandoScanner();
		
		
		//Para aceitar qualquer tipo dado (Desde que primitivo)
		System.out.print("Digite o nome: ");		
		teste.nome = scan.nextLine();		
		System.out.print("\n");
		
		//Para aceitar apenas String (Será capturado apenas o primeiro argumento)
		System.out.print("Digite o seilá: ");		
		teste.seila = scan.next();		
		System.out.print("\n");
		
		//Para aceitar apenas Inteiros
		System.out.print("Digite a idade: ");		
		teste.idade = scan.nextInt();		
		System.out.print("\n");
		
		//Para aceitar apenas Float(nextDouble)
		System.out.print("Digite a preco: ");		
		teste.preco = scan.nextFloat();		
		System.out.print("\n");
		
		System.out.println("Digite tudo de uma vez separado por espaço");
		
		String testeNome = scan.next();
		int testeIdade = scan.nextInt();
		float testePreco = scan.nextFloat();
		
		System.out.println("Você digitou: ");
		System.out.println("Nome:" + teste.nome);
		System.out.println("SeiLa:" + teste.seila);
		System.out.println("Idade:" + teste.idade);
 		System.out.println("Preço:" + teste.preco);
 		System.out.print("\n");
		System.out.println("Você digitou no teste: ");
		System.out.println("Nome:" + testeNome);	
		System.out.println("Idade:" + testeIdade);
 		System.out.println("Preço:" + testePreco);
		
	}
}
