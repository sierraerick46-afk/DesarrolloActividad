package org.example.View;

import org.example.Model.Estudiante;

public class EstudianteView {

    public void mostrarEstudiantes(Estudiante estudiante){

        System.out.println("-----------------LISTA-----------------");
        System.out.println("ID:  " + estudiante.getId());
        System.out.println("Estudiante:  " + estudiante.getNombre());
        System.out.println("Fecha:  " + estudiante.getFecha());
        System.out.println("Asistencia:  " + estudiante.getAsistencia());

    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
