package Modelos;

public abstract class Algoritmos {
	
	
	/**
	 * Dvuelve el sumatorio del numero especificado
	 * 
	 * @param 		numero el numero de que queremos calcular el sumatorio
	 * 
	 * @return 		el sumatorio del numero especificado
	 */
	public static int sumatorio(int numero) {
		
		int suma=0;
		for(int i =0;i<numero;i++) {
			
		
			suma=numero+i;
			
		}
		
		return suma;
		
	}
	/**
	 * Dvuelve el Factorial del numero especificado
	 * 
	 * @param 		numero el numero de que queremos calcular el Factorial
	 * 
	 * @return 		el Factorial del numero especificado
	 */
	public static int Factorial(int numero) {
		
		int factorio=1;
		
		for(int i =1;i<=numero;i++) {
			
		
			factorio*=i;
			
		}
		
		return factorio;
		
	}

}
