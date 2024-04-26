/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

/**
 *
 * @author Santiago
 */
public class Controlador {
    private Listas listas = new Listas();
    
    public Controlador(){
       
    }
  
    public Listas getListas() {
        return listas;
    }

    public void setListas(Listas listas) {
        this.listas = listas;
    }
    
     public void centrar(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}

