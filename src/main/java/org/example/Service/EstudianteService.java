package org.example.Service;

import org.example.Model.Asistencia;
import org.example.Model.EstadoEstudiante;
import org.example.Model.Estudiante;

public interface EstudianteService {

    void registrarAsistencia(Long idEstudiante, String fecha, EstadoEstudiante estado);

    Asistencia consultarAsistencia(Long idEstudiante);

    void eliminarAsistencia(Long idEstudiante);

}
