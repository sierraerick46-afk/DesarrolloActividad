package org.example.Model;

public class Estudiante {

    private Long id;
    private String nombre;
    private String fecha;
    private EstadoEstudiante asistencia;

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public EstadoEstudiante getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(EstadoEstudiante asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", asistencia=" + asistencia +
                '}';
    }

    public void marcarAsistencia(EstadoEstudiante asistencia){
        this.asistencia = asistencia;
    }
}
