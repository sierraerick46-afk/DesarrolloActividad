package org.example.Service;

import org.example.Model.EstadoEstudiante;
import org.example.Model.Estudiante;

public class EstudianteServiceImpl implements EstudianteService {

    @Override
    public Estudiante registrarEstudiante(Long id, String nombre, String fecha){
        return new Estudiante(id, nombre, fecha);
    }

    @Override
    public void cambiarAsistencia(Estudiante estudiante, EstadoEstudiante nuevaAsistencia){
        estudiante.setAsistencia(nuevaAsistencia);
    }

    @Override
    public Estudiante consultarAsistencia(Long idEstudiante, Estudiante asistenciaActual) {
        if(asistenciaActual.getId() == idEstudiante){

            return asistenciaActual;
        }

        return null;
    }

    @Override
    public void eliminarAsistencia(Long idEstudiante, Estudiante asistenciaActual){
        if(asistenciaActual.getId() == idEstudiante){

            asistenciaActual = null;
        }
    }

}
