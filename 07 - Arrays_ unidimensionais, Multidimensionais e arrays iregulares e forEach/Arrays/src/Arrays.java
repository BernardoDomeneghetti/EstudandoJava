import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			//An array is a data structure named static ordered list and this tool can help us with a
			//bunch of works, it can be used to store a lot of data of the same type, 
			//a list of prices, for example
			double[] valores = new  double[10];			
			
			//there are two ways to o through a array
			//the first is using a common for loop using the for index as index variable to the array 
			for (int i = 0; i <= 9; i++) {
				System.out.print("Digite o "+ (i+1) +"o valor:");
				valores[i] = scan.nextDouble();
				System.out.print("\n");
			}
			
			//the second way is using a resource that makes a reference to the actual value using 
			//a local variable, in this code the variable is "val" 
			for (double val : valores) {
				System.out.println(val);
			}
		}
		
		

	}

}
