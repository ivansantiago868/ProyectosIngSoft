/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte.unittest;

import co.edu.uelbosque.sistemas.swii.c1.marte.Robot;
import co.edu.uelbosque.sistemas.swii.c1.marte.Coordenada;
import co.edu.uelbosque.sistemas.swii.c1.marte.CoordenadaPosicion;
import co.edu.uelbosque.sistemas.swii.c1.marte.ManejadorArchivo;
import co.edu.uelbosque.sistemas.swii.c1.marte.Tablero;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author KIVANDY-PC
 */
public class PruebaRobot {
    @Test
    public void traerCoordenadaPosicionRobot() throws FileNotFoundException, IOException
    {
        Coordenada cordenadaInventado=new Coordenada(1,2);
        CoordenadaPosicion cordenadaPosInventado = new CoordenadaPosicion(cordenadaInventado,"N");
        //Coordenada cordenadaInventado2=new Coordenada(4,6);
        //CoordenadaPosicion cordenadaPosInventado2 = new CoordenadaPosicion(cordenadaInventado2,"S");
        ManejadorArchivo manejador=new ManejadorArchivo();
        manejador.setRutaArchivo("src/main/resources/reglas.txt");
        Coordenada sup=manejador.getCoordenadaInicial();
        CoordenadaPosicion corEsperada =  manejador.getCordenadaPosicion();
        Robot rob = new Robot();
        rob.SetEnviarCordenadasRobot(corEsperada);
        Assert.assertEquals(cordenadaPosInventado,rob); 
    }
}