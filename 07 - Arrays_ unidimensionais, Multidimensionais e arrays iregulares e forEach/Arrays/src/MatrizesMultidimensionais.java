import java.util.Scanner;

public class MatrizesMultidimensionais {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Insert the dimension of the matrix: ");
			int val = scan.nextInt(); 
			System.out.print("\n");
			double[][][] cube = new double[val][val][val];
			
			for (int i = 0; i < val; i++) {
				for (int j = 0; j < val; j++) {
					for (int k = 0; k < val; k++) {
						System.out.println("Insert the value of i: " + (i+1) + " j: " + (j+1) + " k: " + (k+1));
						cube[i][j][k]=scan.nextDouble() ;
						
					}
				}
			}
			
			for (int i = 0; i < val; i++) {
				System.out.println("For i:" + (i+1));
				for (int j = 0; j < val; j++) {
					System.out.println("For j:" + (j+1));
					for (int k = 0; k < val; k++) {
						System.out.println("Fo2r k:" + (k+1));	
						System.out.println(cube[i][j][k]);
					}
				}
			}
		}
		
		
	}

}
