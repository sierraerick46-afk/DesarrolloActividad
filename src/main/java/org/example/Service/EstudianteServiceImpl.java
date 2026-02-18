package org.example.Service;

import org.example.Model.Asistencia;
import org.example.Model.EstadoEstudiante;

public class EstudianteServiceImpl implements EstudianteService {

    private Asistencia asistenciaActual;

    @Override
    public void registrarAsistencia(Long idEstudiante, String fecha, EstadoEstudiante estado){
        if (asistenciaActual != null && asistenciaActual.getIdEstudiante().equals(idEstudiante) && asistenciaActual.getFecha().equals(fecha)) {

            throw new IllegalArgumentException("Solo se puede registrar una vez");//Excepcion para detener la ejecucion en caso que sea invalida
        }

        asistenciaActual = new Asistencia(idEstudiante, fecha, estado);
    }

    @Override
    public Asistencia consultarAsistencia(Long idEstudiante) {
        if (asistenciaActual != null && asistenciaActual.getIdEstudiante().equals(idEstudiante)) {

            return asistenciaActual;
        }

        return null;
    }

    @Override
    public void eliminarAsistencia(Long idEstudiante){
        if (asistenciaActual != null && asistenciaActual.getIdEstudiante().equals(idEstudiante)) {
            asistenciaActual = null;
        }
    }

}
