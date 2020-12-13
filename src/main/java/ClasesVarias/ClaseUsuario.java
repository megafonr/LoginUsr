/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesVarias;

/**
 *
 * @author Rolo
 */
public class ClaseUsuario {
  String Nombre, Contrasena, Mail, DNI;   // FNac, FCreac;
//  int Edad;

    public ClaseUsuario(){
        
    }
            
    public ClaseUsuario(String Nombre, String Contrasena, String Mail, String Dni) {
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
        this.Mail = Mail;
        this.DNI = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public String getMail() {
        return Mail;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String Nombre) {
           this.Nombre = Nombre.trim().toUpperCase();
    }

    public void setContrasena(String Contrasena) {
           this.Contrasena = Contrasena.trim();
    }

    public void setMail(String Mail) {
           this.Mail = Mail.trim();
    }

    public void setDNI(String Dni) {
        this.DNI = Dni;
    }
    
}
