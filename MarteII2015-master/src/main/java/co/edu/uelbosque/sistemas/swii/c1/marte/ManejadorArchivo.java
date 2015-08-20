/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swii.c1.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class ManejadorArchivo {
    
    private File reglas;
    FileReader fr;
    BufferedReader br;
    String primeraLinea;
    String siguienteLinea;
    
    public void setRutaArchivo(String ruta) throws FileNotFoundException {
        reglas=new File(ruta);
        if((!reglas.exists()))
          throw new FileNotFoundException("El Archivo de Reglas No Existe");
        fr=new FileReader(reglas);
        br=new BufferedReader(fr);
    }

    private String getPrimeraLinea() throws IOException {
        
        primeraLinea = br.readLine();
        return primeraLinea;
    }
    private String getSiguienteLinea() throws IOException {
        siguienteLinea = br.readLine();
        return siguienteLinea;
    }

    public Coordenada getCoordenadaInicial() throws IOException {
        if(primeraLinea==null)
            getPrimeraLinea();
        String coor[]=this.primeraLinea.split(" ");
        int x=Integer.parseInt(coor[0]);
        int y=Integer.parseInt(coor[1]);

        return new Coordenada(x,y);
    }

    public CoordenadaPosicion getCordenadaPosicion() throws IOException {
        if(siguienteLinea==null)
            getSiguienteLinea();
        String coor[]=this.siguienteLinea.split(" ");
        int x=Integer.parseInt(coor[0]);
        int y=Integer.parseInt(coor[1]);
        String z=coor[2];
        Coordenada gg = new Coordenada(x,y);
        CoordenadaPosicion hh = new CoordenadaPosicion(gg, z);
        return hh;
    }
    
    public Movimiento GetMovimiento() throws IOException {
        getSiguienteLinea();
        char mov []= siguienteLinea.toCharArray();
        Movimiento m = new Movimiento(mov);
        return m;
    }   
  
}
