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
        int x,y;
        if(primeraLinea==null)
            getPrimeraLinea();
        String coor[]=this.primeraLinea.split(" ");
        if(isNumeric(coor[0]) && isNumeric(coor[1]))
        {
            x=Integer.parseInt(coor[0]);
            y=Integer.parseInt(coor[1]);
        }
        else
        {
            throw new FileNotFoundException("Las Coordenadas No Son Correctas");
        }
        return new Coordenada(x,y);
    }
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    public CoordenadaPosicion getCordenadaPosicion() throws IOException {
        int x,y;
        String z;
        getSiguienteLinea();
        String coor[]=this.siguienteLinea.split(" ");
        if(isNumeric(coor[0]) && isNumeric(coor[1]))
        {
            if(coor[2].compareTo("N")== 0 ||coor[2].compareTo("S")== 0 ||coor[2].compareTo("E")== 0 ||coor[2].compareTo("O")== 0 )
            {
                x=Integer.parseInt(coor[0]);
                y=Integer.parseInt(coor[1]);
                z=coor[2];
            }
            else
            {
                throw new FileNotFoundException("Las Coordenadas No Son Correctas");
            }
        }
        else
        {
            throw new FileNotFoundException("Las Coordenadas No Son Correctas");
        }
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
