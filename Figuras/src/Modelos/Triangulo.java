package Modelos;
import java.util.*;

/**
 * 
 */
public class Triangulo {

    
    private int Base;
    private int Altura;

 
    public void Triangulo( int Base,int Altura) {
        this.Altura=1;
        this.Base=1;
    }
    
    public Triangulo() {
    }

    /**
     * @return
     */
    public int GetArea() {
        // TODO implement here
        return Base*Altura/2;
    }

    /**
     * @param Base 
     * @return
     */
    public void SetBase(int Base) {
        // TODO implement here
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
     * @return
     */
    public void SetAltura(int Altura) {
        // TODO implement here
        this.Altura=Altura;
    }

    /**
     * @return
     */
    public int GetAltura() {
        // TODO implement here
        return this.Altura;
    }

}