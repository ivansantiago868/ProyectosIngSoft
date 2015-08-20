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
public class Robot {
    CoordenadaPosicion CorPos;
    Movimiento Mov;
    public void SetEnviarCordenadasRobot(CoordenadaPosicion corEsperada,Movimiento mov) {
        this.CorPos = corEsperada;
        this.Mov = mov;
    }
    @Override
    public boolean equals(Object obj) {
        boolean retorno = false;
        if(obj == null) return false;
        if(!(obj instanceof Robot)) return false;
        Robot tmp=(Robot)obj;        
        if (tmp.CorPos.tf.x==this.CorPos.tf.x && tmp.CorPos.tf.y == this.CorPos.tf.y)
        {
            if(tmp.CorPos.i.compareTo(this.CorPos.i) == 0)
                retorno = true;
        }
        return retorno;
    }
    
}
