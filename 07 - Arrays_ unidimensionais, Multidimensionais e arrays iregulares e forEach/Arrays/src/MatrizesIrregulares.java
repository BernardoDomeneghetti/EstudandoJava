import java.util.Scanner;

public class MatrizesIrregulares {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Insert how many people ");
		int num = scan.nextInt();
		
		String[][] pesquisa = new String[num][];
		
		for (int i = 0; i < pesquisa.length ; i++) {
			System.out.print("Insert how many children does the person have:");
			int childreen = scan.nextInt(); 
			
			pesquisa[i] = new String[childreen];
			
			System.out.println("\n");
			
			for (int j = 0; j < pesquisa[i].length; j++) {
				System.out.print("Insert the name of the children " + (j+1)+": ");
				pesquisa[i][j] = scan.next();
			}			
		}
		
		for (int i = 0;i < pesquisa.length;i++) {
			System.out.println("The chilfreen of person "+(i+1)+ " are:");
			for (int j = 0; j < pesquisa[i].length; j++) {
				System.out.println(pesquisa[i][j]);
			}
		}
		
	}
}
