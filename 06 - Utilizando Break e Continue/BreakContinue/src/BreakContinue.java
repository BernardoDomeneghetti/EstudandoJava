import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		try 
			(Scanner scan = new Scanner(System.in)) {
			System.out.print("Digite dois valores(Separados por espaço):");
			
			int valor = scan.nextInt();
			int limite = scan.nextInt();
			
			for (int i = valor;i <= limite; i++) {
				if (i % 2 == 0) {
					System.out.println("O número " + i + " é divisível por 2");				
				}
			}
			
			for (int i = valor;i <= limite; i++) {
				if (i % 2 == 0) {
					System.out.println("O número " + i + " é o primeiro valor divisível por 2");
					break;
				}
			}
			
			for (int i = valor;i <= limite; i++) {			
				if (i % 2 == 0) {				
					continue;//The continue clause will make the compiler 
							 //ignore remaining code in the loop an jump to the next iteration
				}
				System.out.println(i);
			}
		}

	}

}
