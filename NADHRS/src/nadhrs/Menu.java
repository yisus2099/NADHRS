package nadhrs;

import java.util.Scanner;

/**
 *
 * @author NADHRS
 */
public class Menu {

    //SOLO TIENE TEXTO
    public void textoMenuPrincipal() {
        System.out.println("-----Human Resources-----");
        System.out.println("Bienvenido, ¿Qué quieres hacer?");

        System.out.println(
                "1 - Registrar empleados\n"
                + "2 - Ordenar datos \n"
                + "3 - Revisar datos de empleados \n"
                + "4 - Buscar empleados\n"
                + "5 - Eliminar empleados\n"
                + "6 - Eliminar a todos los empleados \n"
                        + "7 - Salir");
    }

    //MENU PARA REGISTRAR
    public void menuRegistrar(ListEmpleado list) {
            Scanner input = new Scanner(System.in);
        System.out.println("-----Menú registrar-----");
        int option;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println(
                    "1 - Registrar empleados\n"
                    + "2 - Salir "
            );
            option = input.nextInt();

            switch (option) {
                case 1:
                    list.resgistrar();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 2);

    }

    //MENU PARA IMPRIMIR
    public void menuImprimir(ListEmpleado list) {
          Scanner input = new Scanner(System.in);
        System.out.println("-----Menú Imprimir-----");

        int option;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println(
                    "1 - Imprimir datos de todos los empleados \n"
                    + "2 - Salir "
            );
            //Termina texto

            option = input.nextInt();
            switch (option) {
                case 1:
                    list.imprimir();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 2);

    }

    //NUEVO ORDENAR
    public void menuOrdenar(ListEmpleado list) {
            Scanner input = new Scanner(System.in);
        System.out.println("-----Menú ordenar-----");
        int option;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println(
                    "1 - Ordenar por nombre  \n"
                    + "2 - Ordenar por edad \n"
                    + "3 - Salir "
            );
            //Termina texto
            option = input.nextInt();
            switch (option) {
                case 1:
                    list.ordenarPorNombre();
                    break;
                case 2:
                    list.ordenarPorEdad();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 3);
    }

    //MENU BUSQUEDA
    public void menuBusqueda(ListEmpleado list) {
            Scanner input = new Scanner(System.in);
        System.out.println("-----Menú búsqueda-----");
        int option;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println(
                    "1 - Buscar empleado \n"
                    + "2 - Salir"
            );
            //Termina texto
            option = input.nextInt();
            switch (option) {
                case 1:
                    list.buscarEmpleado();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 2);
    }

    //MENU ELIMINAR
    public void menuEliminar(ListEmpleado list) {
            Scanner input = new Scanner(System.in);
        System.out.println("-----Menú eliminar empleados-----");
        int option;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println(
                    "1 - Eliminar empleado \n"
                    + "2 - Salir"
            );
            //Termina texto
            option = input.nextInt();
            switch (option) {
                case 1:
                    list.eliminarEmpleado();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 2);
    }
    
    //MENU ELIMINAR TODO
public void menuEliminarTodo(ListEmpleado list) {
            Scanner input = new Scanner(System.in);
        System.out.println("-----Menú eliminar a todos los empleados-----");
        int option;
        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println(
                    "1 - Eliminar a todos los empleados \n"
                    + "2 - Salir"
            );
            //Termina texto
            option = input.nextInt();
            switch (option) {
                case 1:
                    list.eliminarTodo();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 2);
    }
}
