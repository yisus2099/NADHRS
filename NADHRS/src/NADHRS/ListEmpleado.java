package NADHRS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NADHRS
 */
public class ListEmpleado {

    ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();
    Scanner input = new Scanner(System.in);

    private int numCon;
    private int edad;
    private String nom;
    private String area;
    private String planta;
    private String turno;

    private int cuantosRegistrar;



    public void resgistrar() {
        System.out.println("¿Cuantos empleados quieres registrar?");
        cuantosRegistrar = input.nextInt();

        for (int i = 0; i < cuantosRegistrar; i++) {
            
            System.out.print("Numero de empleado: ");
           numCon = input.nextInt();
           
            System.out.print("Edad: ");
            edad = input.nextInt();

            System.out.print("Nombre: ");
            nom = input.nextLine();
            input.nextLine();
            
            System.out.print("Area: ");
            area = input.nextLine();

            System.out.print("Planta: ");
            planta = input.nextLine();

            System.out.print("Turno: ");
            turno = input.nextLine();

            System.out.println("------------");
            listaEmpleado.add(new Empleado(numCon, edad, nom, area, planta, turno));
           
        }
    }

    public void imprimir() {
        for (int i = 0; i < listaEmpleado.size(); i++) {
            System.out.println("Numero de control: " + listaEmpleado.get(i).getNumControl());
            System.out.println("Edad: " + listaEmpleado.get(i).getEdad());
            System.out.println("Nombre: " + listaEmpleado.get(i).getNombre());
            System.out.println("Area: " + listaEmpleado.get(i).getArea());
            System.out.println("Planta: " + listaEmpleado.get(i).getPlanta());
            System.out.println("Turno: " + listaEmpleado.get(i).getTurno());
            System.out.println("---------------");
        }

    }

    }

