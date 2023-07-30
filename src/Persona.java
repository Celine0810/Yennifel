public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Trabajo trabajo;

    public Trabajo getTrabajo() {
        return trabajo;
    }

    public Persona(String nombre, String apellido, int edad, Trabajo trabajo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.trabajo=trabajo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", trabajo=" + trabajo +
                '}';
    }
}
