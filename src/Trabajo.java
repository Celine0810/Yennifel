import java.util.Date;

public class Trabajo {
    private String empresa;
    private int salario;
    private Date inicio;
    private Date finalizacion;

    public Trabajo(String empresa, int salario, Date inicio, Date finalizacion) {
        this.empresa = empresa;
        this.salario = salario;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getSalario() {
        return salario;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFinalizacion() {
        return finalizacion;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFinalizacion(Date finalizacion) {
        this.finalizacion = finalizacion;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "empresa='" + empresa + '\'' +
                ", salario=" + salario +
                ", inicio=" + inicio +
                ", finalizacion=" + finalizacion +
                '}';
    }
}

