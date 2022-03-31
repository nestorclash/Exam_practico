public class Edificio_ejer2
{ String Ubicacion,NombreEm,CantidadPE,CantidadPisos;
public Edificio_ejer2(String Ubicacion, String NombreEm,String CantidadPE, String CantidadPisos)
{ this.Ubicacion = Ubicacion; this.NombreEm = NombreEm; 
this.CantidadPE = CantidadPE;
this.CantidadPisos = CantidadPisos; }
Edificio_ejer2() { }
public String getUbicacion() 
{ System.out.println("Km 64 1/2 , Desvio de Hacienda el Nilo sobre la Autopista de Zacatecoluca y Usulutan El Salvador ");
return Ubicacion; } 
public void setUbicacion(String Ubicacion) 
{ this.Ubicacion = Ubicacion; }
public String getNombreEm()
{ System.out.println("ITCA FEPADE Edificio A");
return nombreEm; }
public void setNombreEm(String nombreEm) 
{ this.NombreEm = NombreEm; } 
public String getCantidadPE()
{ System.out.println("Cuatro Departamentos ");
return cantidadPE; }
public void setCantidadPE(String cantidadPE) 
{ this.cantidadPE = cantidadPE; }
public String getCantidadPisos() 
{ System.out.println("Tres Pisos en el edificio A Y Dos Pisos en el Edificio B"); 
return cantidadPisos; } 
public void setCantidadPisos(String cantidadPisos)
{ this.cantidadPisos = cantidadPisos; } }
    