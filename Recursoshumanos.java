import java.util.Scanner;

/* En la escuela especializada en ingeniería ITCA-FEPADE
se manejan un número grande de empleados, recursos humanos proporciono la siguiente información.
Todo empleado tiene nombre, código de empleado, edad, dirección, área a la que pertenece, cargo que desempeña en el área, sueldo base, fecha de ingreso.
Los empleados pueden ser docentes o administrativos.
El docente puede ser permanente o por servicio.
El área cuenta con código de área, nombre, cantidad de empleados, numero de edificio.
Al final se desea capturar la información del empleado, imprimir los datos personales y el área a la que pertenece.
Del edificio se conoce la ubicación, el nombre, cantidad de departamentos que alberga, cantidad de pisos.
Además, se desea saber el salario final del empleado tomando en cuenta todos los descuentos de ley (ISSS, AFP Y RENTA), recordar que si es empleado por servicio solo se le debe descontar renta */ 
package ´Recursohumanos;
public class Recursoshumanos
{ private Scanner teclado; private String Nombre,Direccion,NUMdificio; 
private int CargoDe,Codigo,Edad; private double Salario,Salariofinal,Renta,AFP,ISSS; 
public void inicializar()
{ teclado=new Scanner(System.in);
System.out.print("Ingrese Nombre:");
Nombre=teclado.next(); 
System.out.print("Ingrese Edad:");
Edad=teclado.nextInt(); 
System.out.print("Ingrese Salario Bruto:");
Salario=teclado.nextDouble();
System.out.print("Ingrese 1 si su cargo es por Servicio y 2 si es Permanente:"); 
CargoDe =teclado.nextInt(); 
System.out.print("Ingrese su Direccion:");
Direccion=teclado.next(); 
System.out.print("Ingrese Numero de Edificio ");
NUMdificio=teclado.next(); 
System.out.println(""); } 
public void imprimir()
{ System.out.println("Nombre:"+Nombre+"\n");
System.out.println("Edad:"+Edad+"\n");
System.out.println("Direccion:"+Direccion+"\n");
System.out.println("Numero de Edificio :"+NUMdificio );
System.out.println(""); } 
public void cargo() 
{ if (CargoDe==1) { Renta= (Salario * 0.10); Salariofinal= (Salario-Renta);
System.out.println("");
System.out.print("su cargo es por servicio y su Salario final es :"+ Salariofinal);
System.out.println(""); } 
else if(CargoDe==2){ Renta= (Salario * 0.10);
ISSS= (Salario 0.14); AFP= (Salario * 0.10); salariofinal= (salario-renta-ISSS-AFP);
System.out.println(""); System.out.print(" su cargo es permanente y su salario final es :"+salariofinal); 
System.out.println(""); } } 
public static void main(String[] args) { Edificio objeto= new Edificio(); RecursosHumanos Depersona1; Depersona1=new RecursosHumanos();
Depersona1.inicializar(); Depersona1.imprimir(); Depersona1.Cargo(); 
System.out.println(""); objeto.getUbicacion(); objeto.getNombreE();
objeto.getCantidadDeper(); objeto.getCantidadPisos(); System.out.println("");
Codigo_Area codigo= new Codigo_Area(); codigo.getAulas(); codigo.getBiblioteca(); codigo.getCancha(); codigo.getLaboratorio(); codigo.getZona_Verde(); }
}