//MAIN
package NADHRS;

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
        do {
            menu.menu();
            option = input.nextInt();
            switch (option) {
                case 1:
                    list.resgistrar();
                    menu.menuRegistrarSalida(list);
                    break;
                case 2:
                    menu.MenuImprimir(list);
                    list.imprimir(); 
                   
                    break;
                case 3:
                    break;
                default :
                    System.out.println("OPCION NO VALIDA");
            }
        } while (option != 3);

        System.out.println("EL PROGRAMA A TERMINADO");
    }

}
