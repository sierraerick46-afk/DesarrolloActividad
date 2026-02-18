package org.example.View;

import org.example.Model.Asistencia;
import org.example.Model.Estudiante;

public class EstudianteView {

    public void mostrarAsistencia(Asistencia asistencia) {

        System.out.println("--------REGISTRO--------");
        System.out.println("ID Estudiante: " + asistencia.getIdEstudiante());
        System.out.println("Fecha: " + asistencia.getFecha());
        System.out.println("Estado de Asistencia: " + asistencia.getEstado());
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
