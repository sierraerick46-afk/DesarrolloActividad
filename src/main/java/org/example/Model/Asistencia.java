package org.example.Model;

public class Asistencia {

    private Long idEstudiante;
    private String fecha;
    private EstadoEstudiante estado;

    public Asistencia() {
    }

    public Asistencia(Long idEstudiante, String fecha, EstadoEstudiante estado) {
        this.idEstudiante = idEstudiante;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public EstadoEstudiante getEstado() {
        return estado;
    }

    public void setEstado(EstadoEstudiante estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asistencia{" +
                "idEstudiante=" + idEstudiante +
                ", fecha='" + fecha + '\'' +
                ", estado=" + estado +
                '}';
    }
}
