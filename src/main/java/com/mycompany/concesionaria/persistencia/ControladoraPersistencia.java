package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Auto;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();

    public void cargarAuto(Auto auto) {
        autoJpa.create(auto);
    }
    
    public void editarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Auto> obtenerAutos() {
        return autoJpa.findAutoEntities();
    }  

    public Auto obtenerAuto(int id) {
        return autoJpa.findAuto(id);
    }
}
