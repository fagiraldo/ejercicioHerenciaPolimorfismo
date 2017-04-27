/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;

/**
 *
 * @author Estudiante
 */
public abstract class Empleado extends Trabajador{
     protected String nombre;
     protected double salario;

    public Empleado(String nombre, double salario, int id) 
            throws ExcepcionNombre, ExcepcionSalario {
        super(id);
        
        if(nombre.length() <10)
            throw new ExcepcionNombre();
        
        if(salario < 737000)
            throw new ExcepcionSalario();
        
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
   
    
}
