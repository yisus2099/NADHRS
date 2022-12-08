package nadhrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author NADHRS
 */
public class OrdenarEmpleadosLetra  implements Comparator <Empleado>{
@Override
    public int compare(Empleado primerE, Empleado segundoE) {
       return primerE.getNombre().compareTo(segundoE.getNombre());
    }
    }

