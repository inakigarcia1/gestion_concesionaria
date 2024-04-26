
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Santiago
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    
    public Fecha() {
        this.dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        this.mes = Calendar.getInstance().get(Calendar.MONTH)+1;
        this.año = Calendar.getInstance().get(Calendar.YEAR);       
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public boolean formato(String fecha){
        if(fecha.length() != 10) return false;
        if(fecha.charAt(2) != '/') return false;
        if(fecha.charAt(5) != '/') return false;
        
        for(int i = 0; i < fecha.length(); i++){
            
            if(fecha.charAt(i) == '/') continue;
            
            if(!Character.isDigit(fecha.charAt(i))) return false;
        }   
        
        char dia1 = fecha.charAt(0);
        char dia2 = fecha.charAt(1);
        
        this.dia = Integer.parseInt(""+ dia1 + dia2);
        
        char mes1 = fecha.charAt(3);
        char mes2 = fecha.charAt(4);
        
        this.mes = Integer.parseInt("" + mes1 + mes2);
        
        char anio1 = fecha.charAt(6);
        char anio2 = fecha.charAt(7);
        char anio3 = fecha.charAt(8);
        char anio4 = fecha.charAt(9);
        
        this.año = Integer.parseInt("" + anio1 + anio2 + anio3 + anio4);
        
        if(this.dia < 1 || this.dia > 31) return false;
        if(this.mes < 1 || this.mes > 12) return false;
        if(this.año < 2024 || this.año > 2030) return false;
        
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
        
    }
}
