package ejercicio3.bancoycuentas;

public class CuentaCorriente extends TiposCuentasBancarias {
    private int numTransacciones;

    public CuentaCorriente(double saldo) {
        super(saldo);

    }

    @Override
    public void depositarDinero(double dineroDepositar) {
        numTransacciones++;
        this.saldo += dineroDepositar;
        System.out.println("\nHa depositado " + dineroDepositar + " COP en su cuenta corriente");
        System.out.println("El saldo de su cuenta corriente es: " + this.saldo);
        System.out.println("Has realizado: " + numTransacciones + " transacciones en su cuenta corriente");
    }

    @Override
    public void retirarDinero(double dineroRetirar) {

        if (this.saldo >= dineroRetirar) {
            this.saldo -= dineroRetirar;
            numTransacciones++;
            System.out.println("\nHa retirado " + dineroRetirar + " COP de su cuenta corriente");
            System.out.println("El saldo de su cuenta corriente es: " + this.saldo);
            System.out.println("Has realizado: " + numTransacciones + " transacciones en su cuenta corriente");
        } else {
            System.out.println("\nTu saldo es insuficiente");
        }

    }

}
