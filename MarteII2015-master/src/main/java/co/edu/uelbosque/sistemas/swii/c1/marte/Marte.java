/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author clave_f212
 */
public class Marte {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        ManejadorArchivo manager = new ManejadorArchivo();
        manager.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada sup=manager.getCoordenadaInicial();
        CoordenadaPosicion corEsperada =  manager.getCordenadaPosicion();
        Movimiento movEsperado = manager.GetMovimiento();
        CoordenadaPosicion corEsperada1 =  manager.getCordenadaPosicion();
        Movimiento movEsperado1 = manager.GetMovimiento();
    }
}
