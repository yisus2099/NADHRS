package nadhrs;

import java.util.Comparator;

/**
 *
 * @author NADHRS
 */
public class OrdenarEmpleadosEdad implements Comparator <Empleado> {

    @Override
    public int compare(Empleado primerE, Empleado segundoE) {
        int temp = 0;
        if (primerE.getEdad() >segundoE.getEdad()) {
            temp = 1;
        }
        else if (primerE.getEdad() < segundoE.getEdad()) {
            temp = -1;
        }
        else{
            temp = 0;
        }
        return temp;
    }
    
}
