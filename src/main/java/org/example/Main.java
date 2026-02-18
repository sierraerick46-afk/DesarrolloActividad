package org.example;

import org.example.Controller.EstudianteController;
import org.example.Model.EstadoEstudiante;
import org.example.Model.Estudiante;
import org.example.Service.EstudianteService;
import org.example.Service.EstudianteServiceImpl;
import org.example.View.EstudianteView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EstudianteService service = new EstudianteServiceImpl();

        EstudianteView view = new EstudianteView();

        EstudianteController controller = new EstudianteController(service, view);

        Estudiante estudiante = controller.registrarEstudiante(10L,"Carlos","18/02/26");

        controller.mostrarEstudiante(estudiante);

        controller.consultarAsistencia(estudiante.getId(), estudiante);

        controller.cambiarAsistencia(estudiante, EstadoEstudiante.ASISTE);

        controller.mostrarEstudiante(estudiante);



    }
}