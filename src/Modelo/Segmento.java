/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Santiago
 */
public class Segmento {
    private double CostoFlete;
    private double Patentamiento;
    private String segmento;

    public Segmento() {
    }

    public Segmento(String segmento, double CostoFlete) {
        this.CostoFlete = CostoFlete;
        this.segmento = segmento;
    }

    public Segmento(double CostoFlete) {
        this.CostoFlete = CostoFlete;
    }

    public double getCostoFlete() {
        return CostoFlete;
    }

    public void setCostoFlete(double CostoFlete) {
        this.CostoFlete = CostoFlete;
    }

    public double getPatentamiento() {
        return Patentamiento;
    }

    public void setPatentamiento(double Patentamiento) {
        this.Patentamiento = Patentamiento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
    
    
    
}
