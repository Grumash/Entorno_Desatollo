package App;

import Modelos.Rectangulo;
        
public class NewMain {
    public static void main(String[] args) {
        
        Rectangulo r1=new Rectangulo();
        Rectangulo r2=new Rectangulo(2,3);
        
        
        int area1=r1.GetArea();
        int perimetro2=r2.GetPerimetro();
        
        System.out.println("El area del rectangulo 1 es "+ area1);
        System.out.println("El perimetro del rectangulo 2 es "+ perimetro2);
        

    }

}
