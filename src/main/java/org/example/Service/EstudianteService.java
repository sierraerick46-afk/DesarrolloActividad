package org.example.Service;

import org.example.Model.EstadoEstudiante;
import org.example.Model.Estudiante;

public interface EstudianteService {

    Estudiante registrarEstudiante(Long id, String nombre, String fecha);

    void cambiarAsistencia(Estudiante estudiante, EstadoEstudiante nuevaAsistencia);

    Estudiante consultarAsistencia(Long idEstudiante, Estudiante asistenciaActual);

    void eliminarAsistencia(Long idEstudiante, Estudiante asistenciaActual);

}
