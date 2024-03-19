package Modelos;


import java.util.*;


public class Rectangulo {

    public Rectangulo() {
    }


    private int Base;
    private int Altura;

    public void Rectangulo(int Base, int Altura) {
       this.Altura=1;
       this.Base=1;
    }
    
    public void Rectangulo() {
       // TODO implement here
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

    /**
     * @param Altura
     */
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
     * 
     */
    public int GetArea() {
        return Base*Altura;
    }

    /**
     * 
     */
    public int GetPerimetro() {
        return 2*Base+(2*Altura);
              }

}