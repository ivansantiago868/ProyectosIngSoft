/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;
import java.util.Arrays;
/**
 *
 * @author felipevega
 */
public class Movimiento {
    
    char[] posiciones;



    public Movimiento(char[] mov) {
        this.posiciones = mov;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj == null) return false;
        if(!(obj instanceof Movimiento)) return false;
        Movimiento mov = (Movimiento)obj;
        return Arrays.equals(mov.posiciones, posiciones);
    }
    public static boolean validarCoordenadas(char[] arreglo) {
        boolean retorno = false;
        
        for(int i = 0; i< arreglo.length; i++){
             
            if(arreglo[i] == 'I' || arreglo[i] == 'A'){
                retorno = true;
            }
            else{
                retorno = false;
            }
        } 
        return retorno;
    }
}