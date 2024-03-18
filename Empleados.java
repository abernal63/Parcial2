/**
 * Clase que gestiona la lista de empleados y proporciona métodos para su manipulación.
 */
public class Empleados {
    private Empleado[] lista; // Lista de empleados

    /**
     * Constructor de la clase Empleados.
     * @param empleados Arreglo de objetos Empleado que representan la lista inicial de empleados.
     */
    public Empleados(Empleado[] empleados) {
        this.lista = empleados;
    }

    /**
     * Método para aumentar el salario de todos los empleados según un porcentaje dado.
     * @param porcentaje Porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

    /**
     * Método para mostrar la lista de empleados por pantalla.
     */
    public void mostrarEmpleados() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }

    /**
     * Método para dar de alta un nuevo empleado.
     * @param empleado Objeto Empleado que se desea agregar a la lista de empleados.
     */
    public void darDeAltaEmpleado(Empleado empleado) {
        // Implementar lógica para agregar un nuevo empleado a la lista
    }
}