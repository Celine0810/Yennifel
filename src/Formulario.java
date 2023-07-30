import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Formulario {

    static String ENERGEE3 = "Energee3";
    static String COGNIZANT = "Cognizant";

    public static void main(String[] args) {
        Empresa global1 = init();
        int totEmpleados = global1.getEmpleados().size();
        System.out.println("En esta empresa hay " + totEmpleados + " empleados y los que trabajan por energee3 son:");
        List<Persona> empleadosCognizant = new ArrayList<>();
        List<Persona> empleadosEneree3 = new ArrayList<>();
        for (Persona empleado : global1.getEmpleados()) {
            if (empleado.getTrabajo().getEmpresa().equals(ENERGEE3)) {
                empleadosEneree3.add(empleado);
            }
            if (empleado.getTrabajo().getEmpresa().equals(COGNIZANT)) {
                empleadosCognizant.add(empleado);
            }
        }
        System.out.println(empleadosEneree3);
        System.out.println(empleadosCognizant);
    }

    public static Empresa init() {
        Date inicio = new Date();
        Date finalizacion = new Date();
        Trabajo cognizant = new Trabajo(COGNIZANT, 50000, inicio, finalizacion);
        Trabajo eneree3 = new Trabajo(ENERGEE3, 300000, inicio, finalizacion);
        Persona alessandroMarzo = new Persona("Alessandro", "Marzo", 35, eneree3);
        Persona mariaNoel = new Persona("Maria", "Noel", 38, cognizant);
        Persona gustavoPerez = new Persona("Gustavo", "Perez", 33, eneree3);
        Persona marcosNunez = new Persona("Marco", "Nunez", 25, cognizant);
        Persona yennifelSanchez = new Persona("Yennifel", "Sanchez", 33, cognizant);
        Correo correo = new Correo("Rua dos enamorados", "Lisboa", "1170-125", "Portugal");
        List<Persona> personas = new ArrayList();
        personas.add(alessandroMarzo);
        personas.add(mariaNoel);
        personas.add(gustavoPerez);
        personas.add(marcosNunez);
        personas.add(yennifelSanchez);
        Empresa global1 = new Empresa();
        global1.setNombre("Global1");
        global1.setCorreo(correo);
        global1.setCodigoDeEmpresa("1098r3");
        global1.setEmpleados(personas);
        return global1;
    }

}
