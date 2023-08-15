package ejercicio3.bancoycuentas;

public class CuentaAhorro extends TiposCuentasBancarias {
    private int numTransacciones;

    public CuentaAhorro(double saldo) {
        super(saldo);

    }

    @Override
    public void depositarDinero(double dineroDepositar) {
        numTransacciones++;
        this.saldo += dineroDepositar;
        System.out.println("\nHa depositado " + dineroDepositar + " COP en su cuenta de ahorro");
        System.out.println("El saldo de su cuenta de ahorro es: " + this.saldo);
        System.out.println("Has realizado: " + numTransacciones + " transacciones en su cuenta de ahorro");
    }

    @Override
    public void retirarDinero(double dineroRetirar) {

        if (this.saldo >= dineroRetirar) {
            this.saldo -= dineroRetirar;
            numTransacciones++;
            System.out.println("\nHa retirado " + dineroRetirar + " COP de su cuenta de ahorro");
            System.out.println("El saldo de su cuenta de ahorro es: " + this.saldo);
            System.out.println("Has realizado: " + numTransacciones + " transacciones en su cuenta de ahorro");
        } else {
            System.out.println("\nTu saldo es insuficiente");
        }

    }

}
