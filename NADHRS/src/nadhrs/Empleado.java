package nadhrs;

/**
 *
 * @author NADHRS
 */
public class Empleado {

    private int numControl;
    private int edad;
    private double salario;
    private String nombre;
    private String area;
    private String planta;
    private String turno;

    public Empleado(int numControl, int edad, double salario, String nombre, String area, String planta, String turno) {
        this.numControl = numControl;
        this.edad = edad;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    @Override
    public String toString() {
        return "Empleado= " + "Numero de control: " + numControl + ", Nombre: " + nombre + ", Edad: " + edad + ", Salario: " + salario + ", Area: " + area + ", Planta: " + planta + ", Turno: " + turno;
    }

}
