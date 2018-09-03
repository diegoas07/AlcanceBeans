/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.alcances.BeanAlcancePeticion;
import beans.alcances.BeanAlcanceVista;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Desarrollo2
 */
@ManagedBean(name = "controlador")
@RequestScoped
public class Controlador {

    /**
     * Creates a new instance of Controlador
     */
    public Controlador() {
    }
    
    @ManagedProperty(value = "#{peticion}")
    private BeanAlcancePeticion peticion;
    
    @ManagedProperty(value = "#{vista}")
    private BeanAlcanceVista vista;

    
    
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

        // logica alcance request
        System.out.println("valor alcance request: "+ peticion.getValor());
        
        // logica alcance view
        System.out.println("valor alcance view: "+ vista.getValor());
    }
    
    public String changePag (){
        System.out.println("Cambio de PAgina");
        return "despliega";// despliega.xhtml
        
    }

    /**
     * @return the vista
     */
    public BeanAlcanceVista getVista() {
        return vista;
    }

    /**
     * @param vista the vista to set
     */
    public void setVista(BeanAlcanceVista vista) {
        this.vista = vista;
    }
    
}
