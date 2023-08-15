package ejercicio8.empleadosysalarios;

public abstract class TiposEmpleados {
    protected String tipoEmpleado;
    protected double salario;

    public TiposEmpleados(String tipoEmpleado, double salario) {
        this.tipoEmpleado = tipoEmpleado;
        this.salario = salario;
    }

    public abstract void calculoSalario();

}
