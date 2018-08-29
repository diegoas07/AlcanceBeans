/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.alcances.BeanAlcancePeticion;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

/**
 *
 * @author Desarrollo2
 */
@Named(value = "controlador")
@RequestScoped
public class Controlador {

    /**
     * Creates a new instance of Controlador
     */
    public Controlador() {
    }
    
    @Inject
    private BeanAlcancePeticion peticion;

    /**
     * @return the peticion
     */
    public BeanAlcancePeticion getPeticion() {
        return peticion;
    }

    /**
     * @param peticion the peticion to set
     */
    public void setPeticion(BeanAlcancePeticion peticion) {
        this.peticion = peticion;
    }
    
    
    public void changeVal(ActionEvent e){
        System.out.println("Valores almacenados en cada Bean");
        System.out.println("valor alcance request: "+ peticion.getValor());
    }
    
    public String changePag (){
        System.out.println("Cambio de PAgina");
        return "despliega";// despliega.xhtml
        
    }
    
}
