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
public class Modelo {
    private String Modelo;
    private Marca Marca;

    public Modelo() {
    }

    public Modelo(Marca marca, String modelo) {
        this.Modelo = modelo;
        this.Marca = marca;
    }
    
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }
}
