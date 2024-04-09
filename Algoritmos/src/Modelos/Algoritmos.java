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

}
