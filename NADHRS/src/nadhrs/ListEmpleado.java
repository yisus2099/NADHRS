package nadhrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author NADHRS
 */
public class ListEmpleado {

    ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

    public void resgistrar() {
        Scanner ent = new Scanner(System.in);
        int numCon, edad, cuantosRegistrar;
        double salario;
        String nom, area, planta, turno;

        System.out.println("¿Cuantos empleados quieres registrar?");
        cuantosRegistrar = ent.nextInt();

        for (int i = 0; i < cuantosRegistrar; i++) {

            System.out.println("Numero de empleado: ");
            numCon = ent.nextInt();

            System.out.println("Edad: ");
            edad = ent.nextInt();
            
             System.out.println("Salario: ");
            salario= ent.nextDouble();
            
            ent.nextLine();
            
            System.out.println("Nombre: ");
            nom = ent.nextLine();

            System.out.println("Area: ");
            area = ent.nextLine();

            System.out.println("Planta: ");
            planta = ent.nextLine();

            System.out.println("Turno: ");
            turno = ent.nextLine();

            System.out.println("------------");
            listaEmpleado.add(new Empleado(numCon, edad, salario, nom, area, planta, turno));
          
        }
    }

    public void imprimir() {
        if (! listaEmpleado.isEmpty()) {
        for (int i = 0; i < listaEmpleado.size(); i++) {
            if (i == 0) {
                System.out.println("---------------");
                System.out.println("Numero de control: " + listaEmpleado.get(i).getNumControl());
                System.out.println("Nombre: " + listaEmpleado.get(i).getNombre());
                System.out.println("Edad: " + listaEmpleado.get(i).getEdad());
                System.out.println("Salario: " + listaEmpleado.get(i).getSalario());
                System.out.println("Area: " + listaEmpleado.get(i).getArea());
                System.out.println("Planta: " + listaEmpleado.get(i).getPlanta());
                System.out.println("Turno: " + listaEmpleado.get(i).getTurno());
                System.out.println("---------------");
            } else {
                System.out.println("Numero de control: " + listaEmpleado.get(i).getNumControl());
                System.out.println("Nombre: " + listaEmpleado.get(i).getNombre());
                System.out.println("Edad: " + listaEmpleado.get(i).getEdad());
                System.out.println("Salario: " + listaEmpleado.get(i).getSalario());
                System.out.println("Area: " + listaEmpleado.get(i).getArea());
                System.out.println("Planta: " + listaEmpleado.get(i).getPlanta());
                System.out.println("Turno: " + listaEmpleado.get(i).getTurno());
                System.out.println("---------------");
            }
        }
               }
        else {
            System.out.println("No hay empleados");
        }
    }

    public void ordenarPorNombre() {
        Collections.sort(listaEmpleado, new OrdenarEmpleadosLetra());
        System.out.println("Se han ordenar los empleados. Podra verlo al imprimirlos");
    }

    public void ordenarPorEdad() {
        Collections.sort(listaEmpleado, new OrdenarEmpleadosEdad());
        System.out.println("Se han ordenar los empleados. Podra verlo al imprimirlos");
    }

    public void buscarEmpleado() {
        Scanner input = new Scanner(System.in);
        Collections.sort(listaEmpleado, new OrdenarEmpleadosLetra());
        System.out.println("Ingrese el nombre completo del empleado que quiere buscar: ");
        String nom;
        nom = input.nextLine();
        OrdenarEmpleadosLetra ordenar = new OrdenarEmpleadosLetra();
        Empleado busqueda = new Empleado(0, 0, 0, nom, null, null, null);
        int ind = Collections.binarySearch(listaEmpleado, busqueda, ordenar);
        if (ind < 0) {
            System.out.println("Ese empleado no existe");
        } else {
            System.out.println(listaEmpleado.get(ind));
        }
    }

    public void eliminarEmpleado() {
        Scanner input = new Scanner(System.in);
        Collections.sort(listaEmpleado, new OrdenarEmpleadosLetra());
        System.out.println("Ingrese el nombre completo del empleado que quiere eliminar: ");
        String nom;
        nom = input.nextLine();
        OrdenarEmpleadosLetra ordenar = new OrdenarEmpleadosLetra();
        Empleado busqueda = new Empleado(0, 0, 0, nom, null, null, null);
        int ind = Collections.binarySearch(listaEmpleado, busqueda, ordenar);
        if (ind < 0) {
            System.out.println("Ese empleado no existe");
        } else {
            //Empieza menú
            int opt;
            do {
                System.out.println("¿Seguro que quieres eliminarlo?");
                System.out.println(listaEmpleado.get(ind));
                System.out.println(
                        "1 - Si \n"
                        + "2 - No "
                );
                opt = input.nextInt();

                switch (opt) {
                    case 1:
                        listaEmpleado.remove(ind);
                        System.out.println("Ha sido eliminado");
                        opt = 2;
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("OPCION NO VALIDA");
                }
            } while (opt != 2);
        }
    }

    public void eliminarTodo() {
        Scanner input = new Scanner(System.in);
        int opt;
        do {
            System.out.println("¿Seguro que quieres eliminar a todos los empleados?");
            System.out.println(
                    "1 - Si \n"
                    + "2 - No "
            );
            opt = input.nextInt();

            switch (opt) {
                case 1:
                    listaEmpleado.clear();
                    System.out.println("Todos los empleados han sido eliminados");
                    opt = 2;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (opt != 2);
    }
}
