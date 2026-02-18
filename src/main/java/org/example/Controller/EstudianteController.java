package org.example.Controller;

import org.example.Model.EstadoEstudiante;
import org.example.Model.Estudiante;
import org.example.Service.EstudianteService;
import org.example.View.EstudianteView;

public class EstudianteController {

    private final EstudianteService service;
    private final EstudianteView view;

    public EstudianteController(EstudianteService service, EstudianteView view) {
        this.service = service;
        this.view = view;
    }

    public Estudiante registrarEstudiante(Long id, String nombre, String fecha){

        Estudiante estudiante = service.registrarEstudiante(id, nombre, fecha);
        view.mostrarMensaje("ESTUDIANTE REGISTRADO" + estudiante.getAsistencia());
        return estudiante;
    }

    public void cambiarAsistencia(Estudiante estudiante, EstadoEstudiante nuevaAsistencia){

        service.cambiarAsistencia(estudiante, nuevaAsistencia);
        view.mostrarMensaje("ASISTENCIA CAMBIADA" + nuevaAsistencia);
    }

    public Estudiante consultarAsistencia(Long idEstudiante, Estudiante asistenciaActual){
        return service.consultarAsistencia(idEstudiante, asistenciaActual);
    }

    public void eliminarAsistencia(Long idEstudiante, Estudiante asistenciaActual){
        service.eliminarAsistencia(idEstudiante, asistenciaActual);

    }

    public void mostrarEstudiante(Estudiante estudiante){
        view.mostrarEstudiantes(estudiante);
    }



}
