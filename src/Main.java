import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// Ordenar numeros de mayor a menor
		
		int numeros[] = {1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};
		
		Arrays.sort(numeros);
		for(int i = numeros.length-1; i >= 0 ; i--) {
			System.out.println(numeros[i]);
		}
	}

}
