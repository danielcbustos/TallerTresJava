package ejercicio8.empleadosysalarios;

public class EmpleadoPorHoras extends TiposEmpleados {
    private int horasTrabajoDia;
    private int diasTrabajoSemana;

    public EmpleadoPorHoras(double salario, int horasTrabajoDia, int diasTrabajoSemana) {
        super(" por horas", salario);
        this.horasTrabajoDia = horasTrabajoDia;
        this.diasTrabajoSemana = diasTrabajoSemana;

    }

    @Override
    public void calculoSalario() {
        var salarioMensual = this.salario * this.horasTrabajoDia * this.diasTrabajoSemana * 4;
        System.out.println("El salario mensual del empleado" + tipoEmpleado + " es: " + salarioMensual);
    }
}
