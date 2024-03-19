package App;

import Modelos.*;

public class NewMain {
    public static void main(String[] args) {
        
        Rectangulo r1=new Rectangulo();
        Rectangulo r2=new Rectangulo();
        
        Circulo c1=new Circulo();
        Circulo c2=new Circulo();
        
        Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();
        
        
        
        int area1=r1.GetArea();
        int perimetro2=r2.GetPerimetro();
        
        System.out.println("El area del rectangulo 1 es "+ area1);
        System.out.println("El perimetro del rectangulo 2 es "+ perimetro2);
        

    }

}
