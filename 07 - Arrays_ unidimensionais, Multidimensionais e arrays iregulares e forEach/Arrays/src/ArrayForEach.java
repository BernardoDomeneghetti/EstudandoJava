import help.TipoExemplo;

public class ArrayForEach {

	public static void main(String[] args) {
		//there is another type of using the for loop called "For Each"
		// to use this resource we need a array first 
		
		int[] array = new int[10];
		
		int count = 0;
		
		for (int i =0; i< 10; i++) {
			array[i] = (i+1);
		}
		
		//after declare and fill the array we 
		//can use the for each array by this way 
		
		for (int arrayI: array) {
			System.out.println(arrayI);
		}
		
		//when using object arrays instead primitive types
 		//we can use the for each array to fill or manipulate the 
		// object's attributes
		TipoExemplo[] teste = new TipoExemplo[10];
		int a = 0;
//		for(TipoExemplo exemplo:teste) {
//			exemplo
//			
//		}
		
		
	}

}
