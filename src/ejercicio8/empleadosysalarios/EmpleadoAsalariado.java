package ejercicio8.empleadosysalarios;

public class EmpleadoAsalariado extends TiposEmpleados {

    public EmpleadoAsalariado(double salario) {
        super("asalariado", salario);
    }

    @Override
    public void calculoSalario() {
        System.out.println("El salario mensual del " + tipoEmpleado + " es: " + salario);
    }

}
