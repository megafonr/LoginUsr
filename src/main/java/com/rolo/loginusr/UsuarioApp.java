/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.loginusr;

import Formus.Login;

/**
 *
 * @author Rolo
 */
public class UsuarioApp {

    /** 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Login login = new Login();

        login.setVisible(true);
//
//  tarea 1: en Input login ocultar password
//  tarea 2: poner una Imagen en ambos forms
//  tarea 3: Crear una clase Usuarios (ya lo tenemos).
//  tarea 4: Instanciar el objeto de la clase usuario en el boton crear de DatosUsr
//  tarea 5: Mostrar en una ventana nueva los datos cargados. (Usar joptionPanel)
//
//  Clase Validaciones
//     Username , Sin espacio, max. Caracteres(8-20), Letras y numeros
//     Password: longitud (8-20), Sin espacio, Coincidencias,
//     DNI: Longitud (), Numeros, Sin Espacios
//     Mail: Long(), un @, Sin Espacios 
    }
}
