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
public class Color {
    private String Color;
    private int cantidad = 0;

    public Color(String Color, int cantidad) {
        this.Color = Color;
        this.cantidad = cantidad;
    }

    
    public Color(String Color) {
        this.Color = Color;
    }

    public Color() {
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
  
    
}
