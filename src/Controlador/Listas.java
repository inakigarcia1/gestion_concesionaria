package Controlador;

import Modelo.*;

import java.util.ArrayList;
/**
 *
 * @author Santiago
 */
public class Listas {
    private ArrayList<Cliente> ListaDeClientes = new ArrayList();
    private ArrayList<Marca> ListaDeMarcas = new ArrayList();
    private ArrayList<Modelo> ListaDeModelos = new ArrayList();
    private ArrayList<Version> ListaDeVersiones = new ArrayList();
    private ArrayList<Segmento> ListaDeSegmentos = new ArrayList();
    private ArrayList<Reserva> ListaDeReservas = new ArrayList();

    public Listas() {
        
        // Crear clientes
        ListaDeClientes.add(new Cliente("Vazquez", "Pedro", 00000001, "Calle falsa 123", "mail1@gmail.com", 1111111, 1111111));
        ListaDeClientes.add(new Cliente("García Tarcic", "Iñaki", 00000001, "Calle falsa 321", "mail2@mail.com", 1111112, 1111112));
        ListaDeClientes.add(new Cliente("Gonzalez", "Pepe", 00000003, "Calle falsa 322", "mail3@mail.com", 1111113, 1111113));
        ListaDeClientes.add(new Cliente("Ortega", "Juan", 00000004, "Calle falsa 221", "mail4@mail.com", 1111114, 1111114));

       
        // Crear marcas
        Marca toyota = new Marca("Toyota");
        Marca ford = new Marca("Ford");
        Marca chevrolet = new Marca("Chevrolet");
        
        ListaDeMarcas.add(toyota);
        ListaDeMarcas.add(ford);
        ListaDeMarcas.add(chevrolet);
        
        // Crear modelos
        Modelo hilux = new Modelo(toyota, "Hilux");
        Modelo etios = new Modelo(toyota, "Etios");
        Modelo corolla = new Modelo(toyota, "Corolla");
        
        Modelo focus = new Modelo(ford, "Focus");
        Modelo ranger = new Modelo(ford, "Ranger");
        Modelo fiesta = new Modelo(ford, "Fiesta");
        
        
        Modelo s10 = new Modelo(chevrolet, "S10");
        
        
        ListaDeModelos.add(hilux);
        ListaDeModelos.add(etios);
        ListaDeModelos.add(corolla);
        ListaDeModelos.add(focus);
        ListaDeModelos.add(ranger);
        ListaDeModelos.add(fiesta);
        ListaDeModelos.add(s10);
        
        // Crear segmentos
        Segmento a = new Segmento("A", 150);
        Segmento b = new Segmento("B", 100);
        Segmento c = new Segmento("C", 80);
        Segmento d = new Segmento("D", 50);
        Segmento e = new Segmento("E", 50);
        Segmento f = new Segmento("F", 25);
        
        ListaDeSegmentos.add(a);
        ListaDeSegmentos.add(b);
        ListaDeSegmentos.add(c);
        ListaDeSegmentos.add(d);
        ListaDeSegmentos.add(e);
        ListaDeSegmentos.add(f);
        
        // Crear versiones
        ListaDeVersiones.add(new Version(hilux, "SRX 4X4", 10000, b));
        ListaDeVersiones.add(new Version(hilux, "SRV 4X2", 8000, b));
        
        ListaDeVersiones.add(new Version(etios, "X 6 M/T", 5000, b));
        ListaDeVersiones.add(new Version(etios, "XLS Pack 6 M/T", 6500, b));
        
        ListaDeVersiones.add(new Version(corolla, "2.0 SE-G CVT", 5000, b));
        ListaDeVersiones.add(new Version(corolla, "2.0 GR-S CVT", 9250, b));
        
        
        ListaDeVersiones.add(new Version(focus, "1.5 Active Design SIP", 8000, c));
        
        ListaDeVersiones.add(new Version(ranger, "XL 2.0L 4X2", 11000, b));
        ListaDeVersiones.add(new Version(ranger, "LTD+ 2.0L V6 4WD", 15000, b));
        
        ListaDeVersiones.add(new Version(fiesta, "9.1 RS WRC", 7300, d));
        ListaDeVersiones.add(new Version(fiesta, "9.7 R1", 7000, d));

        ListaDeVersiones.add(new Version(s10, "Cabina doble", 15000, d));
        
        // Crear Stock
        this.generarStock("SRX 4X4", "Rojo", 1);
        this.generarStock("SRX 4X4", "Negro", 1);
        
        this.generarStock("SRV 4X2", "Gris", 2);
        this.generarStock("SRV 4X2", "Rojo", 1);
        
        this.generarStock("X 6 M/T", "Rojo", 1);
        this.generarStock("X 6 M/T", "Blanco", 1);
        this.generarStock("X 6 M/T", "Marrón", 1);
        
        this.generarStock("XLS Pack 6 M/T", "Negro", 1);
        this.generarStock("XLS Pack 6 M/T", "Azul", 1);
        this.generarStock("XLS Pack 6 M/T", "Blanco", 1);
        
        this.generarStock("2.0 SE-G CVT", "Rojo", 1);
        this.generarStock("2.0 SE-G CVT", "Amarillo", 1);
        this.generarStock("2.0 SE-G CVT", "Negro", 1);
        
        this.generarStock("2.0 GR-S CVT", "Gris", 1);
        this.generarStock("2.0 GR-S CVT", "Negro", 1);
        this.generarStock("2.0 GR-S CVT", "Celeste", 1);
        
        
        this.generarStock("XL 2.0L 4X2", "Rojo", 3);
        
        this.generarStock("LTD+ 2.0L V6 4WD", "Negro", 1);
        
        this.generarStock("9.1 RS WRC", "Gris", 2);
        
        this.generarStock("9.7 R1", "Blanco", 1);
        
        
        this.generarStock("1.5 Active Design SIP", "Azul", 1);
        this.generarStock("1.5 Active Design SIP", "Amarillo", 2);
        
        this.generarStock("Cabina doble", "Gris", 2);
        this.generarStock("Cabina doble", "Blanco", 1);
        
        
        
    }
    
    private void generarStock(String descripcion, String color, int cantidad){
        for(Version version: this.ListaDeVersiones){
            if(version.getDescripcion().equals(descripcion)){
                this.ListaDeVersiones.get(this.ListaDeVersiones.indexOf(version)).getColores().add(new Color(color, cantidad));
                break;
            }
        }
    }

    public ArrayList<Cliente> getListaDeClientes() {
        return ListaDeClientes;
    }

    public void setListaDeClientes(ArrayList<Cliente> ListaDeClientes) {
        this.ListaDeClientes = ListaDeClientes;
    }

    public ArrayList<Marca> getListaDeMarcas() {
        return ListaDeMarcas;
    }

    public void setListaDeMarcas(ArrayList<Marca> ListaDeMarcas) {
        this.ListaDeMarcas = ListaDeMarcas;
    }

    public ArrayList<Modelo> getListaDeModelos() {
        return ListaDeModelos;
    }

    public void setListaDeModelos(ArrayList<Modelo> ListaDeModelos) {
        this.ListaDeModelos = ListaDeModelos;
    }

    public ArrayList<Version> getListaDeVersiones() {
        return ListaDeVersiones;
    }

    public void setListaDeVersiones(ArrayList<Version> ListaDeVersiones) {
        this.ListaDeVersiones = ListaDeVersiones;
    }

    public ArrayList<Segmento> getListaDeSegmentos() {
        return ListaDeSegmentos;
    }

    public void setListaDeSegmentos(ArrayList<Segmento> ListaDeSegmentos) {
        this.ListaDeSegmentos = ListaDeSegmentos;
    }

    public ArrayList<Reserva> getListaDeReservas() {
        return ListaDeReservas;
    }

    public void setListaDeReservas(ArrayList<Reserva> ListaDeReservas) {
        this.ListaDeReservas = ListaDeReservas;
    }

   
    
}
