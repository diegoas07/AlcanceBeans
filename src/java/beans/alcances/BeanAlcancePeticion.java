/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.alcances;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Desarrollo2
 */
@Named(value = "peticion")
@RequestScoped
public class BeanAlcancePeticion {

    /**
     * Creates a new instance of BeanAlcancePeticion
     */
    public BeanAlcancePeticion() {
    }
    
    private String valor;

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}
