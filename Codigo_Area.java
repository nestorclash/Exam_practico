/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo_Area;
public class Codigo_Area
{ String Aulas,Biblioteca,Zona_Verde,laboratorio,Cancha; public Codigo_Area
        (String Aulas, String laboratorio, String Biblioteca, String Zona_Verde, String Cancha)
        { this.Aulas = this.Biblioteca; this.laboratorio = laboratorio; this.Zona_Verde = Zona_Verde;
         this.Cancha = Cancha; } public Codigo_Area()
        { } public String getAulas() 
        { System.out.println("el codigo de las Aulas es Us01"); return Aulas; } 
        public void setAulas(String Aulas)
        { this.Aulas= Aulas; } 
        public String getBiblioteca()
        { System.out.println("El Codigo de la Biblioteca es 450");
        return Biblioteca; } public void setBiblioteca(String Biblioteca)
        { this.Biblioteca = Biblioteca; } public String getZona_Verde()
        { System.out.println("El Codigo de la Zona Verde es ZV01"); 
        return Zona_Verde; } public void setZona_VerdE(String Zona_Verde)
        { this.Zona_Verde = Zona_Verde; } 
        public String getLaboratorio(){ System.out.println("El Codigo de laboratorio es LAB01");
        return laboratorio; } 
        public void setLabpratorio(String laboratorio)
        { this.laboratorio = laboratorio; } 
        public String getCancha()
        { System.out.println("El Codigo de la Cancha es CA01");
        return Cancha; } public void setCancha(String Cancha) 
        { this.Cancha = Cancha; }
        
}
