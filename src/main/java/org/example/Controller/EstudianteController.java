package org.example.Controller;

import org.example.Model.Asistencia;
import org.example.Model.EstadoEstudiante;
import org.example.Service.EstudianteService;
import org.example.View.EstudianteView;

public class EstudianteController {

    private final EstudianteService service;
    private final EstudianteView view;

    public EstudianteController(EstudianteService service, EstudianteView view) {
        this.service = service;
        this.view = view;
    }

    public void registrarAsistencia(Long idEstudiante, String fecha, EstadoEstudiante estado){
        service.registrarAsistencia(idEstudiante, fecha, estado);
        view.mostrarMensaje("Asistencia registrada");
    }


    public Asistencia consultarAsistencia(Long idEstudiante){
        Asistencia asistencia = service.consultarAsistencia(idEstudiante);

        if (asistencia != null) {
            view.mostrarAsistencia(asistencia);
        } else {
            view.mostrarMensaje("Se ha guardado la asistencia del estudiante");
        }
        return asistencia;
    }

    public void eliminarAsistencia(Long idEstudiante){
        service.eliminarAsistencia(idEstudiante);

    }
}
