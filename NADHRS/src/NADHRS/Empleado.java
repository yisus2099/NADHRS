
package NADHRS;

/**
 *
 * @author Jesús Alejandro Torres Ramírez
 */
public class Empleado {
    private int numControl;
    private int edad;
    private String nombre;
    private String area;
    private String planta;
    private String turno;

    public Empleado(int numControl, int edad, String nombre, String area, String planta, String turno) {
        this.numControl = numControl;
        this.edad = edad;
        this.nombre = nombre;
        this.area = area;
        this.planta = planta;
        this.turno = turno;
    }

    public int getNumControl() {
        return numControl;
    }

    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
        
}
