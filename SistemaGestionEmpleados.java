import java.util.Scanner;

/**
 * Clase principal que gestiona el sistema de gestión de empleados.
 */
public class SistemaGestionEmpleados {

    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos (no utilizado en este caso).
     */
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", "Desarrollador", 50000);
        empleados[1] = new Empleado("María", "Diseñadora", 45000);
        empleados[2] = new Empleado("Pedro", "Gerente", 60000);

        Empleados gestionEmpleados = new Empleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.PORCENTAJE_AUMENTO_SALARIO);
        double porcentaje = scanner.nextDouble();

        gestionEmpleados.aumentarSalario(porcentaje);

        System.out.println(Constantes.LISTA_EMPLEADOS);
        gestionEmpleados.mostrarEmpleados();

        scanner.close();
    }
}
