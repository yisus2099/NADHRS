package NADHRS;

import java.util.Scanner;

/**
 *
 * @author NADHRS
 */
public class Menu {

    Scanner input = new Scanner(System.in);

    public void menu() {
        System.out.println("-----Human Resources-----");
        System.out.println("Bienvenido, ¿Qué quieres hacer?");

        System.out.println(
                "1 - Registrar empleado \n"
                + "2 - Revisar info de empleado \n"
                + "3 - Salir ");
    }

    public void menuRegistrarSalida(ListEmpleado list)  {
        System.out.println("-----Menu informacion-----");
        System.out.println("¿Que informacion quieres registrat?");

       int option;
        do {
            System.out.println(
                    "1-Voler a registrar \n"
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
    
    public void MenuImprimir(ListEmpleado list){
          System.out.println("-----Menu Imprimir-----");
          System.out.println("¿Que quieres hacer?");
         int option;
        do {
         System.out.println(
                    "1-Imprimir datos de todos los empleados \n"
                    + "2-Salir "
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
  
    
        public void MenuImprimirSalida(ListEmpleado list)  {
        System.out.println("-----Menu informacion-----");
        System.out.println("¿Que informacion quieres recibir?");

       int option;
        do {
            System.out.println(
                    "1-Salir "
            );
            option = input.nextInt();
            
            //Se acaba texto
            switch (option) {
                case 1:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 1);

    }
}

