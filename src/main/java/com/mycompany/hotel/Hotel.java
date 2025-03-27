package com.mycompany.hotel;

/**
 * Clase principal del sistema de gestión de un hotel. Permite registrar,
 * eliminar y mostrar clientes, empleados y habitaciones.
 */
import com.mycompany.hotel.objetos.ClienteBAH;
import com.mycompany.hotel.objetos.EmpleadoBAH;
import com.mycompany.hotel.objetos.HabitacionBAH;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

    /**
     * Método principal que gestiona la interacción con el usuario.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<ClienteBAH> clientes = new ArrayList<ClienteBAH>();
        ArrayList<EmpleadoBAH> empleados = new ArrayList<EmpleadoBAH>();
        ArrayList<HabitacionBAH> habitaciones = new ArrayList<HabitacionBAH>();

        ClienteBAH cliente = null;
        EmpleadoBAH empleado = null;
        HabitacionBAH habitacion = null;
        int idCliente;
        int idEmpleado;
        String nombre;
        String apellidos;
        String dni;
        int numeroTelefono;
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;

        int opcion = 10;

        do {
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Dar de baja a un cliente.");
            System.out.println("3. Registrar empleado.");
            System.out.println("4. Dar de baja a un empleado.");
            System.out.println("5. Agregar nueva habitación.");
            System.out.println("6. Eliminar una habitación.");
            System.out.println("7. Mostrar todos los clientes.");
            System.out.println("8. Mostrar todos los empleados.");
            System.out.println("9. Mostrar todas las habitaciones.");
            System.out.println("10. Salir del programa.");
            System.out.println("Introduce el número de la opcion deseada: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    opcion(teclado, clientes);

                    break;
                case 2:
                    opcion2(teclado, clientes);

                    break;
                case 3:
                    empleado = opcion3(teclado, empleado, empleados);

                    break;
                case 4:
                    empleado = opcion4(teclado, empleados, empleado);

                    break;
                case 5:
                    habitacion = opcion5(teclado, habitacion, habitaciones);

                    break;
                case 6:
                    habitacion = opcion6(teclado, habitaciones, habitacion);

                    break;
                case 7:
                    opcion7(clientes);

                    break;
                case 8:
                    opcion8(empleados);

                    break;
                case 9:
                    opcion9(habitaciones);

                    break;
                case 10:
                    System.out.println("Cerrando el programa...");

                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }

    /**
     * Muestra todas las habitaciones registradas.
     *
     * @param habitaciones Lista de habitaciones.
     */
    private static void opcion9(ArrayList<HabitacionBAH> habitaciones) {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {

            for (HabitacionBAH claseAMostrar : habitaciones) {
                System.out.println("ID: " + claseAMostrar.getIdHabitacion());
                System.out.println("Tipo: " + claseAMostrar.getTipo());
                System.out.println("Número de camas: " + claseAMostrar.getNumeroCamas());
                System.out.println("Coste por día: " + claseAMostrar.getCostePorDia());
                System.out.println("");
            }
        }
    }

    /**
     * Muestra todos los empleados registrados..
     *
     * @param empleados Lista de empleados.
     */

    private static void opcion8(ArrayList<EmpleadoBAH> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("No hay profesores para mostrar...");
        } else {

            for (EmpleadoBAH empleadoAMostrar : empleados) {
                System.out.println("ID: " + empleadoAMostrar.getIdEmpleado());
                System.out.println("Nombre: " + empleadoAMostrar.getNombre());
                System.out.println("Apellidos: " + empleadoAMostrar.getApellidos());
                System.out.println("DNI: " + empleadoAMostrar.getDNI());
                System.out.println("Número de teléfono: " + empleadoAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
    }

    /**
     * Muestra todos los clientes registrados.
     *
     * @param clientes Lista de clientes.
     */
    private static void opcion7(ArrayList<ClienteBAH> clientes) {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (ClienteBAH clienteAMostrar : clientes) {
                System.out.println("ID: " + clienteAMostrar.getIdCliente());
                System.out.println("Nombre: " + clienteAMostrar.getNombre());
                System.out.println("Apellidos: " + clienteAMostrar.getApellidos());
                System.out.println("DNI: " + clienteAMostrar.getDNI());
                System.out.println("Número de teléfono: " + clienteAMostrar.getNumeroTelefono());
                System.out.println("");
            }
        }
    }

    /**
     * Elimina una habitación del sistema.
     *
     * @param teclado Scanner para entrada de datos.
     * @param habitaciones Lista de habitaciones.
     */
    private static HabitacionBAH opcion6(Scanner teclado, ArrayList<HabitacionBAH> habitaciones, HabitacionBAH habitacion) {
        int idCliente;
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        idCliente = teclado.nextInt();
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para borrar...");
        } else {

            for (HabitacionBAH clienteABorrar : habitaciones) {
                if (clienteABorrar.getIdHabitacion() == idCliente) {
                    habitacion = clienteABorrar;

                }
            }

            habitaciones.remove(habitacion);
        }
        return habitacion;
    }

    /**
     * Agrega una nueva habitación al sistema.
     *
     * @param teclado Scanner para entrada de datos.
     * @param habitaciones Lista de habitaciones.
     */
    private static HabitacionBAH opcion5(Scanner teclado, HabitacionBAH habitacion, ArrayList<HabitacionBAH> habitaciones) {
        int idHabitacion;
        String tipo;
        int numeroCamas;
        double costePorDia;
        System.out.println("Introduzca el id de la nueva habitación: ");
        idHabitacion = teclado.nextInt();
        habitacion = new HabitacionBAH(idHabitacion);
        teclado.nextLine();
        System.out.println("Introduzca el tipo de la nueva habitación: ");
        tipo = teclado.nextLine();
        habitacion.setTipo(tipo);
        System.out.println("Introduzca número de camas de la nueva habitación: ");
        numeroCamas = teclado.nextInt();
        habitacion.setNumeroCamas(numeroCamas);
        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        costePorDia = teclado.nextDouble();
        habitacion.setCostePorDia(costePorDia);
        teclado.nextLine();
        habitaciones.add(habitacion);
        return habitacion;
    }

    /**
     * Da de baja a un empleado.
     *
     * @param teclado Scanner para entrada de datos.
     * @param empleados Lista de empleados.
     */
    private static EmpleadoBAH opcion4(Scanner teclado, ArrayList<EmpleadoBAH> empleados, EmpleadoBAH empleado) {
        int idCliente;
        System.out.println("Introduzca el id del empleado a dar de baja: ");
        idCliente = teclado.nextInt();
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para dar de baja...");
        } else {

            for (EmpleadoBAH clienteABorrar : empleados) {
                if (clienteABorrar.getIdEmpleado() == idCliente) {
                    empleado = clienteABorrar;

                }
            }
            empleados.remove(empleado);
        }
        return empleado;
    }

    /**
     * Registra un nuevo empleado.
     *
     * @param teclado Scanner para entrada de datos.
     * @param empleados Lista de empleados.
     */
    private static EmpleadoBAH opcion3(Scanner teclado, EmpleadoBAH empleado, ArrayList<EmpleadoBAH> empleados) {
        int idEmpleado;
        String nombre;
        String apellidos;
        String dni;
        int numeroTelefono;
        System.out.println("Introduzca el id del nuevo empleado: ");
        idEmpleado = teclado.nextInt();
        empleado = new EmpleadoBAH(idEmpleado);
        teclado.nextLine();
        System.out.println("Introduzca el nombre del nuevo empleado: ");
        nombre = teclado.nextLine();
        empleado.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        apellidos = teclado.nextLine();
        empleado.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo empleado: ");
        dni = teclado.nextLine();
        empleado.setDNI(dni);
        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        numeroTelefono = teclado.nextInt();
        empleado.setNumeroTelefono(numeroTelefono);
        empleados.add(empleado);
        return empleado;
    }

    /**
     * Da de baja a un cliente.
     *
     * @param teclado Scanner para entrada de datos.
     * @param clientes Lista de clientes.
     */
    private static void opcion2(Scanner teclado, ArrayList<ClienteBAH> clientes) {
        int idCliente;
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        idCliente = teclado.nextInt();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para dar de baja...");
        } else {
            for (ClienteBAH clienteABorrar : clientes) {
                if (clienteABorrar.getIdCliente() == idCliente) {
                    clientes.remove(clienteABorrar);
                }
            }
        }
    }

    /**
     * Registra un nuevo cliente.
     *
     * @param teclado Scanner para entrada de datos.
     * @param clientes Lista de clientes.
     */
    private static void opcion(Scanner teclado, ArrayList<ClienteBAH> clientes) {
        int idCliente;
        ClienteBAH cliente;
        String nombre;
        String apellidos;
        int numeroTelefono;
        System.out.println("Introduzca el id del nuevo cliente: ");
        idCliente = teclado.nextInt();
        cliente = new ClienteBAH(idCliente);
        teclado.nextLine();
        System.out.println("Introduzca el nombre del nuevo cliente: ");
        nombre = teclado.nextLine();
        cliente.setNombre(nombre);
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        apellidos = teclado.nextLine();
        cliente.setApellidos(apellidos);
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        cliente.setDNI(teclado.nextLine());
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        numeroTelefono = teclado.nextInt();
        cliente.setNumeroTelefono(numeroTelefono);
        clientes.add(cliente);
    }
}
