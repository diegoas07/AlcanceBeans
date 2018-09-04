/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.alcances;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Desarrollo2
 */
@ManagedBean(name = "sesion")
@SessionScoped
public class BeanAlcanceSesion implements Serializable {

    /**
     * Creates a new instance of BeanAlcanceSesion
     */
    public BeanAlcanceSesion() {
    }
 
        private String valor;

    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    
}
