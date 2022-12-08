package nadhrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NADHRS
 */
public class NADHRS {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        ListEmpleado list = new ListEmpleado();
        Menu menu = new Menu();
        int option;
        //Menú principal
        do {
            menu.textoMenuPrincipal();
            option = input.nextInt();
            switch (option) {
                case 1:
                    //Menu registrar
                    menu.menuRegistrar(list);
                    break;
                case 2:
                    //Menu ORDENAR
                    menu.menuOrdenar(list);
                    break;
                case 3:
                    //Menu Imprimir 
                    menu.menuImprimir(list);
                    break;
                case 4:
                    //Menu Buscar
                    menu.menuBusqueda(list);
                    break;
                case 5:
                    //Menu Eliminar
                    menu.menuEliminar(list);
                    break;
                case 6:
                    menu.menuEliminarTodo(list);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 7);

        System.out.println("EL PROGRAMA A TERMINADO  \n"
                + "Autores: \n"
                + "Jesús Alejandro Torres Ramírez - 21550341\n"
                + "Diego Gael Martin del Campo Loa - 21550321\n"
                + "Dajahira Narahi Gonzalez Zavala - 21550340");
    }
}
