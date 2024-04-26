/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Version {
    private String Descripcion;
    private double PrecioUnidad;
    private Modelo modelo;
    private Segmento segmento = new Segmento();
    private ArrayList<Color> colores = new ArrayList();

    public Version(Modelo modelo, String Descripcion, double PrecioUnidad, Segmento segmento) {
        this.Descripcion = Descripcion;
        this.PrecioUnidad = PrecioUnidad;
        this.modelo = modelo;
        this.segmento.setSegmento(segmento.getSegmento());
        this.segmento.setCostoFlete(segmento.getCostoFlete());
        this.calcularPatentamiento();
    }

    public Version(Modelo modelo, String Descripcion, double PrecioUnidad) {
        this.Descripcion = Descripcion;
        this.PrecioUnidad = PrecioUnidad;
        this.modelo = modelo;
    }

    public Version(String Descripcion, double PrecioUnidad, Segmento segmento) {
        this.Descripcion = Descripcion;
        this.PrecioUnidad = PrecioUnidad;
        this.segmento = segmento;
    }
    
 
    public Version(String Descripcion, double PrecioUnidad) {
        this.Descripcion = Descripcion;
        this.PrecioUnidad = PrecioUnidad;
    }

    public Version() {
    }

    public final void calcularPatentamiento(){
        this.segmento.setPatentamiento(this.PrecioUnidad * 0.02);
    }
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(double PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Color> getColores() {
        return colores;
    }

    public void setColores(ArrayList<Color> colores) {
        this.colores = colores;
    }
    
    
    
}
