package Modelos;


public class Rectangulo extends Figura {
	
	


    private int Base;
    private int Altura;

    /**
     * Constructor que crea un rectangulo con la base y la altura especificadas, en metros
     *  
     * @param Base		la base del rectangulo , en metros
     * @param Altura	la altura del rectangulo, en metros
     */
    
    public Rectangulo(int Base, int Altura) {
       this.Altura=Altura;
       this.Base=Base;
    }
	/**
     *@author Mouad 
     *
     * Constructor por defecto.Crea un rectangulo con base y altura 1, en metros
     */
    public Rectangulo() {
    	
        this.Altura=1;
        this.Base=1;
    	
    }   
    



    /**
     * @param Base
     */
    public void SetBase(int Base) {
        this.Base=Base;
    }

    /**
     * @return
     */
    public int GetBase() {
        // TODO implement here
        return this.Base;
    }


    public void SetAltura(int Altura) {
        this.Altura=Altura;
    }

    /**
     * @return
     */
    public int GetAltura() {
        // TODO implement here
        return this.Altura;
    }
    
    /**
     * @see modelos.Figura#area
     */
    @Override
    public double area() {
        return Base*Altura;
    }
    /**
     * @see modelos.Figura#perimetro
     */
  	@Override
    public double perimetro() {
        return 2*Base+(2*Altura);
              }

}