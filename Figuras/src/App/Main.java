package App;

import Modelos.*;

public class Main {
    public static void main(String[] args) {
        
        Rectangulo r1=new Rectangulo();
        
       
        
        

        
        r1.SetBase(1);
        r1.SetAltura(2);
        
        int area1=r1.area();
        int perimetro2=r1.perimetro();
           
        
        System.out.println("El area del rectangulo 1 es "+ area1);
        
        

    }

}
