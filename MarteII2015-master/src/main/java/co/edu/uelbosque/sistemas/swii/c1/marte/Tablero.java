/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

/**
 *
 * @author KIVANDY-PC
 */
public class Tablero {
    
    Coordenada cord;
    public void setEnviarCoordenadasTamañoTablero(Coordenada sup) {
        this.cord = sup;
    }
    @Override
    public boolean equals(Object obj) {
        boolean retorno = false;
        if(obj == null) return false;
        if(!(obj instanceof Tablero)) return false;
        Tablero tmp=(Tablero)obj;        
        if (tmp.cord.x==this.cord.x && tmp.cord.y == this.cord.y )
        {
                retorno = true;
        }
        return retorno;
    }
}
