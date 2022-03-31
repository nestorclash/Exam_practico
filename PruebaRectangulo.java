import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        double longitud=1;
        double anchura=1;
        int Area_rectangulo;
     
        System.out.println("Ingrese la longitud del rectangulo:");
        longitud=leer.nextDouble();
        System.out.println("Ingrese el perimetro del rectangulo");
        double perimetro = leer.nextDouble();
        System.out.println("Ingrese la base del rectangulo:");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        double altura = leer.nextDouble();
        
        
        System.out.println("El resultado del Perimetro es:" +PruebaRectangulo.calcularPerimetro(longitud,anchura));
        System.out.println("El resultado del Area es:" +PruebaRectangulo.calcularArea(altura,base));
        
        if( longitud >0 && longitud< 20.00 && anchura>0 && anchura<20.00){
            System.out.println("La Longitud es Mayor");
        }else{
            System.out.println("La Anchura es Menor");
        }
        
        
        
    }
    public static double calcularPerimetro (double Longitud,double Anchura){
        double perimetro=0;
        perimetro= 2*Longitud + Anchura;                                      
        return perimetro;
        
        
        
    }
    
    public static double calcularArea (double Altura, double Base){
        double Area_rectangulo=0;
        Area_rectangulo = (base * altura);
       return Area_rectangulo;
    }
    
       
        
    
    
}
