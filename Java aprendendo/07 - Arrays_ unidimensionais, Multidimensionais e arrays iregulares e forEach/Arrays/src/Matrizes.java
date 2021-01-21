import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[][] notasAlunos = new double[5][4];
		
		for (int i = 0; i < 5; i++ ) {
			System.out.println("Para o aluno " + (i + 1) + " digite:" );
			for (int j = 0; j < 4; j++) {
				System.out.print("Digite o a nota " + (j+1) + ": ");
				notasAlunos[i][j] = scan.nextDouble();
			}
		}
		
		for (int i = 0; i < 5; i++ ) {
			System.out.println("As notas do aluno "+ (i+1)+" são:");
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j+1) + " : " + notasAlunos[i][j] );				
			}
		}
		
	}

}
