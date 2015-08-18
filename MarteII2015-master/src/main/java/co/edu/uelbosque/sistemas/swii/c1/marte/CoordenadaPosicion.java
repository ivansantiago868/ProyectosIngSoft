/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author clave-e205
 */
public class CoordenadaPosicion {
    
    Coordenada tf ;
    String i;
    public CoordenadaPosicion(Coordenada supesperada, String i) {
        this.tf = supesperada;
        this.i = i;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof CoordenadaPosicion)) return false;
        CoordenadaPosicion tmp=(CoordenadaPosicion)obj;
        return (tmp.tf.x == this.tf.x && tmp.tf.y == this.tf.y && this.i ==  tmp.i);
    }
    
    
}
