/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;


import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import co.edu.uelbosque.sistemas.swii.c1.marte.Coordenada;
import co.edu.uelbosque.sistemas.swii.c1.marte.CoordenadaPosicion;
import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import static com.sun.org.apache.regexp.internal.RETest.test;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author KIVANDY-PC
 */
public class ProbarTablero {
    @Test
    public void traerTamañoMapaManjoArchivoEsCorrecto() throws FileNotFoundException, IOException
    {
        Coordenada supesperada=new Coordenada(7,6);
        Tablero tableroCreado = new Tablero();
        tableroCreado.setEnviarCoordenadasTamañoTablero(supesperada);
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada sup=manejador.getCoordenadaInicial();
        Tablero tt = new Tablero();
        tt.setEnviarCoordenadasTamañoTablero(sup);
        Assert.assertEquals(tableroCreado,tt); 
    }
    @Test
    public void verificarTableroCoordenadas() throws IOException
    {
        Coordenada supesperada=new Coordenada(7,6);
        Tablero tableroCreado = new Tablero();
        tableroCreado.setEnviarCoordenadasTamañoTablero(supesperada);
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada sup=manejador.getCoordenadaInicial();
        Tablero tt = new Tablero();
        tt.setEnviarCoordenadasTamañoTablero(sup);
        tt.GetConfirmarDatosCOrrectos(tt);
        
    }
}
