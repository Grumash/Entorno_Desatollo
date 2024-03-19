package Modelos;


import java.util.*;

/**
 * 
 */
public class Circulo {

    public Circulo() {
    }

    private int Radio;
    public int Diametro;

    public void Circulo( int Radio,int Diametro) {
        this.Radio=1;
        this.Diametro=1;
    }

    public void Circulo() {
   
    }


    /**
     * @return
     */
    public double GetArea() {
        // TODO implement here
        return Math.PI*(Radio/Radio);
    }

    /**
     * @return
     */
    public double GetPerimetro() {
        // TODO implement here
        return 2*Math.PI*Radio;
    }

    /**
     * @param Radio 
     * @return
     */
    public void SetRadio(int Radio) {
        // TODO implement here
        this.Radio=Radio;
    }

    /**
     * @return
     */
    public int GetRadio() {
        // TODO implement here
        return this.Radio;
    }

    /**
     * @param Diametro 
     * @return
     */
    public void SetDiametro(int Diametro) {
        // TODO implement here
           this.Diametro=Diametro;
    }

    /**
     * @return
     */
    public int GetDiametro() {
        // TODO implement here
        return this.Diametro;
    }

}