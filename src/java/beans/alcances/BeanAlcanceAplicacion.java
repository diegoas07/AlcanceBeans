/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.alcances;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author Desarrollo2
 */
@ManagedBean(name = "aplicacion")
@ApplicationScoped
public class BeanAlcanceAplicacion {

    /**
     * Creates a new instance of BeanAlcanceAplicacion
     */
    public BeanAlcanceAplicacion() {
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
