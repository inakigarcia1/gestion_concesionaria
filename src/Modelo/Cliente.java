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
public class Cliente {
    private String Apellido;
    private String Nombre;
    private long DNI;
    private String Direccion;
    private String Email;
    private long Cel;
    private long Tel;

    public Cliente() {
    }
    
    public Cliente(String Apellido, String Nombre, long DNI, String Direccion, String Email, long Cel, long Tel) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Cel = Cel;
        this.Tel = Tel;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public long getCel() {
        return Cel;
    }

    public void setCel(long Cel) {
        this.Cel = Cel;
    }

    public long getTel() {
        return Tel;
    }

    public void setTel(long Tel) {
        this.Tel = Tel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Apellido=" + Apellido + ", Nombre=" + Nombre + '}';
    }
    
    
     
}
