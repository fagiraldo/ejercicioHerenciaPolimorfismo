/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotaler;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;
import dao.ArchivoDB;
import java.io.FileNotFoundException;
import modelo.Administrador;
import modelo.Consultor;
import modelo.Empresa;
import modelo.LiderProyecto;
import modelo.Programador;

/**
 *
 * @author Estudiante
 */
public class EjercicioTaler {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
     Empresa emp= new Empresa();
     Consultor c = new Consultor("Ing", 1);
     emp.agregarTrabajador(c);
     Administrador a =null;
     try{
       a= new Administrador("Abcdefghijk", 2);
       emp.agregarTrabajador(a);
     }catch(ExcepcionNombre e){
       e.printStackTrace();
     }catch(ExcepcionSalario e){
       e.printStackTrace();
     }
     
     try{
      Programador p = 
      new Programador("java", "Absdcegdas2", 2000000, 3);
      emp.agregarTrabajador(p);
     LiderProyecto lider = 
       new LiderProyecto("java", "poiuytreeasdfasd", 3000000, 4);
     lider.agregarProgramador(p);
     emp.agregarTrabajador(lider);
      
     }catch(ExcepcionNombre e){
       e.printStackTrace();
     }catch(ExcepcionSalario e){
      e.printStackTrace();
     }catch(ExcepcionLenguaje e){
      e.printStackTrace();
     }
     ArchivoDB arc = new ArchivoDB();
     try{
     arc.guardarInformacion(emp);
     }catch(FileNotFoundException e){
       e.printStackTrace();
     }
     arc.cargarInformacion();
 }
    
}
