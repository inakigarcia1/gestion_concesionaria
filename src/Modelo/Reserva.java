/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Inaki
 */
public class Reserva {
    private Cliente cliente;
    private Fecha fecha;
    private Marca marca;
    private Modelo modelo;
    private Version version;
    private Segmento segmento;
    private Color color;
    private double precioFinal;
    private String estado;
    
    public Reserva(Cliente cliente, Fecha fecha, Marca marca, Modelo modelo, Version version, Color color) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        this.color = color;
        calcularPrecioFinal();
    }
 
    public Reserva() {
     }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Segmento getSegmento() {
        return segmento;
    }

    public void setSegmento(Segmento segmento) {
        this.segmento = segmento;
    }

    public void calcularPrecioFinal(){
        this.precioFinal = this.version.getPrecioUnidad() + this.version.getSegmento().getCostoFlete() + this.version.getSegmento().getPatentamiento();
    }
    
    @Override
    public String toString() {
        return "Reserva{" + "cliente=" + cliente + ", fecha=" + fecha + ", marca=" + marca + ", modelo=" + modelo + ", version=" + version + ", segmento=" + segmento + ", color=" + color + ", precioFinal=" + precioFinal + '}';
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
    
    
    
    
}
