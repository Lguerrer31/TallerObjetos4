/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author coste
 */
public class Password {
    
    private String contraseña;
    private int longitud = 8;

    public Password(String contraseña,int longitud) {
        this.contraseña = contraseña;
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public String EsFuerte(){
        String aux;
        if (this.getLongitud() >= 8) {
            aux = "Su contraseña es fuerte";
        }
        else{
            aux = "Su contraseña es débil";
        }
        return aux;
    }
    
    public String Mostrar(){
        String aux;
        aux = "Su contraseña es: "+this.getContraseña();
        return aux;
    }
    
    public void Cambiar(String a){
        this.setContraseña(a);
    }

    

 
    
    
}
