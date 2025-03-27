package com.mycompany.hotel;

import com.mycompany.hotel.objetos.ClienteBAH;
import com.mycompany.hotel.objetos.EmpleadoBAH;
import com.mycompany.hotel.objetos.HabitacionBAH;
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
                Scanner sca = new Scanner(System.in);
                ArrayList<ClienteBAH> clientes = new ArrayList<ClienteBAH>();
                    ArrayList<EmpleadoBAH> empleados = new ArrayList<EmpleadoBAH>();
                    ArrayList<HabitacionBAH> habitaciones = new ArrayList<HabitacionBAH>();

                    ClienteBAH cliente = null;
        EmpleadoBAH empleado = null;
                    HabitacionBAH habitación = null;
                    int idCliente;
int idEmpleado;
String nombre;
                                                String apellidos;
                                                String DNI;
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

                        opcion = sca.nextInt();

                        switch (opcion) {
                            case 1:
                                            System.out.println("Introduzca el id del nuevo cliente: ");
                                            idCliente = sca.nextInt();
                                            cliente = new ClienteBAH(idCliente);
                                            sca.nextLine();
                                            System.out.println("Introduzca el nombre del nuevo cliente: ");
                                            nombre = sca.nextLine();
                                            cliente.nombre = nombre;
        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        apellidos = sca.nextLine();
        cliente.apellidos = apellidos;
        System.out.println("Introduzca el DNI del nuevo cliente: ");
        cliente.DNI = sca.nextLine();
        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
                                                numeroTelefono = sca.nextInt();
                                                cliente.numeroTelefono = numeroTelefono;
                                                clientes.add(cliente);

                                                break;
                                            case 2:
                                                System.out.println("Introduzca el id del cliente a dar de baja: ");
                                                idCliente = sca.nextInt();

    if (clientes.isEmpty()) {
        System.out.println("No hay clientes para dar de baja...");
    } else {
        for (ClienteBAH clienteABorrar : clientes) {
            if (clienteABorrar.idCliente == idCliente) {
                clientes.remove(clienteABorrar);
            }
        }
                                                }

                                                break;
                                            case 3:
                                                System.out.println("Introduzca el id del nuevo empleado: ");
                                                idEmpleado = sca.nextInt();
                                                empleado = new EmpleadoBAH(idEmpleado);
                                                sca.nextLine();
                                                System.out.println("Introduzca el nombre del nuevo empleado: ");
    nombre = sca.nextLine();
    empleado.nombre = nombre;
    System.out.println("Introduzca los apellidos del nuevo empleado: ");
    apellidos = sca.nextLine();
    empleado.apellidos = apellidos;
                                                                                        System.out.println("Introduzca el DNI del nuevo empleado: ");
                                                                                        DNI = sca.nextLine();
                                                                                        empleado.DNI = DNI;
                                                                                        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
                                                                                        numeroTelefono = sca.nextInt();
                                                                                        empleado.numeroTelefono = numeroTelefono;
                                        empleados.add(empleado);

                                        break;
                                    case 4:
                                        System.out.println("Introduzca el id del empleado a dar de baja: ");
    idCliente = sca.nextInt();
    if (empleados.isEmpty()) {
        System.out.println("No hay empleados para dar de baja...");
    } else {

                                                                                        for (EmpleadoBAH clienteABorrar : empleados) {
                                                                                            if (clienteABorrar.idEmpleado == idCliente) {
                                                                                                empleado = clienteABorrar;

            }
        }
        empleados.remove(empleado);
                                                        }

                                                        break;
                                                    case 5:
        System.out.println("Introduzca el id de la nueva habitación: ");
        idHabitacion = sca.nextInt();
        habitación = new HabitacionBAH(idHabitacion);
        sca.nextLine();
                    System.out.println("Introduzca el tipo de la nueva habitación: ");
                                tipo = sca.nextLine();
                                habitación.tipo = tipo;
                                System.out.println("Introduzca número de camas de la nueva habitación: ");
            numeroCamas = sca.nextInt();
            habitación.numeroCamas = numeroCamas;
            System.out.println("Introduzca el coste por día de la nueva habitación: ");
                    costePorDia = sca.nextDouble();
                        habitación.costePorDia = costePorDia;
                        sca.nextLine();
                        habitaciones.add(habitación);

                                                                                                                                                                                                            break;
                                                                                                                                                                                                        case 6:
                                                                                                                                                                                                            System.out.println("Introduzca el id de la habitación a eliminar: ");
                                        idCliente = sca.nextInt();
                                        if (habitaciones.isEmpty()) {
        System.out.println("No hay habitaciones para borrar...");
    } else {

                                    for (HabitacionBAH clienteABorrar : habitaciones) {
                                        if (clienteABorrar.idHabitacion == idCliente) {
                                            habitación = clienteABorrar;

                }
            }

            habitaciones.remove(habitación);
                                }

                                break;
                            case 7:
if (clientes.isEmpty()) {
    System.out.println("No hay clientes para mostrar...");
} else {
    for (ClienteBAH clienteAMostrar : clientes) {
                                                 System.out.println("ID: " +                                                                                                                                                clienteAMostrar.idCliente);
                            System.out.println("Nombre: " + clienteAMostrar.nombre);
                                        System.out.println("Apellidos: " + clienteAMostrar.apellidos);
                            System.out.println("DNI: " + clienteAMostrar.DNI);
            System.out.println("Número de teléfono: " + clienteAMostrar.numeroTelefono);
            System.out.println("");
        }
    }

                                    break;
                                case 8:
                                    if (empleados.isEmpty()) {
                                        System.out.println("No hay profesores para mostrar...");
            } else {

                for (EmpleadoBAH empleadoAMostrar : empleados) {
                                         System.out.println("ID: " + empleadoAMostrar.idEmpleado);
                            System.out.println("Nombre: " + empleadoAMostrar.nombre);
                                        System.out.println("Apellidos: " + empleadoAMostrar.apellidos);
                            System.out.println("DNI: " + empleadoAMostrar.DNI);
                                        System.out.println("Número de teléfono: " + empleadoAMostrar.numeroTelefono);
                            System.out.println("");
                        }
                    }

                    break;
                                    case 9:
                                        if (habitaciones.isEmpty()) {
                                            System.out.println("No hay habitaciones para mostrar...");
                                        } else {

                        for (HabitacionBAH claseAMostrar : habitaciones) {
        System.out.println("ID: " + claseAMostrar.idHabitacion);
        System.out.println("Tipo: " + claseAMostrar.tipo);
                            System.out.println("Número de camas: " + claseAMostrar.numeroCamas);
                            System.out.println("Coste por día: " + claseAMostrar.costePorDia);
                                            System.out.println("");
                                        }
                                    }

                            break;
            case 10:
                                        System.out.println("Cerrando el programa...");

                        break;
                            default:
        System.out.println("La opción seleccionada no existe...");
                                                        }
                                                    } while (opcion != 10);
                                                }
                }
