/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import Excepciones.ExcepcionLenguaje;
import Excepciones.ExcepcionNombre;
import Excepciones.ExcepcionSalario;

/**
 *
 * @author Estudiante
 */
public class Administrador extends Empleado{

    public Administrador(String nombre, int id) 
    throws ExcepcionNombre, ExcepcionSalario{
        super(nombre, 1000000, id);
    }
    
    @Override
    public double calcularSalario() {
        return this.salario;
    }

    @Override
    public String listarInformacion() {
        return "Administrador "  + this.id + " " + this.nombre;
    }
}
