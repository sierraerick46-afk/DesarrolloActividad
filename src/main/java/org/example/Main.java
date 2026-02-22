package org.example;

import org.example.Controller.EstudianteController;
import org.example.Model.Asistencia;
import org.example.Model.EstadoEstudiante;
import org.example.Service.EstudianteService;
import org.example.Service.EstudianteServiceImpl;
import org.example.View.EstudianteView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EstudianteService service = new EstudianteServiceImpl();
        EstudianteView view = new EstudianteView();
        EstudianteController controller = new EstudianteController(service, view);

        int opc = 0;

        while (opc != 4) {

            System.out.println("--------ASISTENCIA ESTUDIANTES---------");
            System.out.println("1. Registrar Asistencia");
            System.out.println("2. Consultar Asistencia");
            System.out.println("3. Eliminar Asistencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {

                case 1:
                    System.out.print("Ingrese ID del estudiante: ");
                    Long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Ingrese fecha: ");
                    String fecha = scanner.nextLine();

                    System.out.println("Estado:");
                    System.out.println("1. ASISTE");
                    System.out.println("2. FALLA");
                    System.out.println("3. INCAPACIDAD");

                    int estadoOp = scanner.nextInt();
                    scanner.nextLine();

                    EstadoEstudiante estado = null;

                    switch (estadoOp) {
                        case 1:
                            estado = EstadoEstudiante.ASISTIO;
                            break;
                        case 2:
                            estado = EstadoEstudiante.FALLO;
                            break;
                        case 3:
                            estado = EstadoEstudiante.INCAPACIDAD;
                            break;
                        default:
                            System.out.println("INVALIDO");
                            continue;
                    }

                    try {
                        controller.registrarAsistencia(id, fecha, estado);
                        System.out.println("Asistencia registrada");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:
                    System.out.print("Ingrese ID del estudiante: ");
                    Long idConsulta = scanner.nextLong();
                    scanner.nextLine();

                    Asistencia asistencia = controller.consultarAsistencia(idConsulta);

                    if (asistencia != null) {
                        view.mostrarAsistencia(asistencia);
                    } else {
                        System.out.println("No tiene registro");
                    }

                    break;

                case 3:
                    System.out.print("Ingrese ID del estudiante: ");
                    Long idEliminar = scanner.nextLong();
                    scanner.nextLine();

                    controller.eliminarAsistencia(idEliminar);
                    System.out.println("Registro eliminada");

                    break;

                case 4:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }

        scanner.close();
    }
}
