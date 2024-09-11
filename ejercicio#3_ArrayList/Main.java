import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Tarea> listaDeTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Menu de Gestion de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Ver todas las tareas");
            System.out.println("4. Eliminar tareas completadas");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    
                    System.out.print("Introduce la descripcion de la tarea: ");
                    String descripcion = scanner.nextLine();
                    listaDeTareas.add(new Tarea(descripcion));
                    System.out.println("Tarea añadida.");
                    break;

                case 2:
                    System.out.print("Introduce la descripcion de la tarea a marcar como completada: ");
                    String tareaCompletar = scanner.nextLine();
                    marcarTareaComoCompletada(listaDeTareas, tareaCompletar);
                    break;

                case 3:
                    verTareas(listaDeTareas);
                    break;

                case 4:
                    eliminarTareasCompletadas(listaDeTareas);
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion del 1 al 5.");
                    break;
            }
        }

        scanner.close();
    }

    public static void marcarTareaComoCompletada(ArrayList<Tarea> tareas, String descripcion) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equalsIgnoreCase(descripcion) && !tarea.isCompletada()) {
                tarea.marcarComoCompletada();
                System.out.println("Tarea marcada como completada.");
                return;
            }
        }
        System.out.println("Tarea no encontrada o ya completada.");
    }

    public static void verTareas(ArrayList<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en la lista.");
            return;
        }

        System.out.println("Lista de tareas:");
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }

    public static void eliminarTareasCompletadas(ArrayList<Tarea> tareas) {
        tareas.removeIf(Tarea::isCompletada);
        System.out.println("Tareas completadas eliminadas.");
    }
}

