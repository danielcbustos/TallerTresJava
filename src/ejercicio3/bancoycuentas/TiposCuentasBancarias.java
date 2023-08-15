package ejercicio3.bancoycuentas;

import ejercicio3.bancoycuentas.interfaces.ISistemaBancario;

public class TiposCuentasBancarias implements ISistemaBancario {
    protected double saldo;

    public TiposCuentasBancarias(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositarDinero(double dineroDepositar) {

    }

    @Override
    public void retirarDinero(double dineroRetirar) {

    }

}
