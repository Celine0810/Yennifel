import java.util.List;

public class Empresa {
    private String nombre;
    private Correo correo;
    private String codigoDeEmpresa;
    private List<Persona> empleados;

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", correo=" + correo +
                ", codigoDeEmpresa='" + codigoDeEmpresa + '\'' +
                ", empleados=" + empleados +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public Correo getCorreo() {
        return correo;
    }

    public String getCodigoDeEmpresa() {
        return codigoDeEmpresa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(Correo correo) {
        this.correo = correo;
    }

    public void setCodigoDeEmpresa(String codigoDeEmpresa) {
        this.codigoDeEmpresa = codigoDeEmpresa;
    }

    public void setEmpleados(List<Persona> empleados) {
        this.empleados = empleados;
    }

    public List<Persona> getEmpleados() {
        return empleados;
    }
}
