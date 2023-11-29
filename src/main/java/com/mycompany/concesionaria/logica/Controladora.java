package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void cargarAuto(String modelo, String color, String patente, int cantidadPuertas){
        Auto auto = new Auto();
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        controlPersis.cargarAuto(auto);
    }
    
    public void editarAuto(int id, String modelo, String color, String patente, int cantidadPuertas){
        Auto auto = new Auto();
        auto.setId(id);
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        controlPersis.editarAuto(auto);
    }
    
    public void eliminarAuto(int id){
        controlPersis.eliminarAuto(id);
    }
    
    public List<Auto> obtenerAutos(){
        return controlPersis.obtenerAutos();
    }

    public Auto obtenerAutos(int id) {
        return controlPersis.obtenerAuto(id);
    }
}
