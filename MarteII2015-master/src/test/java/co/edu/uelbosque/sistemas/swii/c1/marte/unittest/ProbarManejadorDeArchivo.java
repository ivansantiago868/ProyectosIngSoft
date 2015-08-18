/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.CoordenadaPosicion;
import co.edu.uelbosque.sistemas.swii.c1.marte.Coordenada;
import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Alejandro
 */
public class ProbarManejadorDeArchivo {
    
    @Test(expectedExceptions = FileNotFoundException.class)
    public void elArchivoNoExiste() throws FileNotFoundException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("reglas.txt");
    }
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
    }
    

    
    @Test
    public void laCoordenadaSuperiorEsCorrecta() throws FileNotFoundException, IOException{
        Coordenada supesperada=new Coordenada(7,6);
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada sup=manejador.getCoordenadaInicial();
        Assert.assertEquals(supesperada,sup); 
    }
    
    @Test
    public void lasCordenadasDePosicionSonCorectas() throws IOException 
    {
        Coordenada supesperada=new Coordenada(7,6);
        CoordenadaPosicion cor = new CoordenadaPosicion(supesperada,"I");
        ManejadorArchivo manejador=new ManejadorArchivo();
        CoordenadaPosicion corEsperada =  manejador.getCordenadaPosicion();
        Assert.assertEquals(cor,corEsperada); 
    }
    
    
}