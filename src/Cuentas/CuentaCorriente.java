package Cuentas;

import Clientes.Cliente;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(Cliente cliente){
        super(cliente);
        this.impuestoCC=0.30;
        this.impuestoCV=0.21;
        this.tipoCuenta="cc";
    }
    @Override
    public Boolean saldoValido(Double retiro) {
        double result= this.saldo-retiro;
        if (result< 0)
            return false;
        else
            return true;
    }

    @Override
    public void deposito(Double monto) {
        this.saldo+=monto;
    }

    @Override
    public void retiro(Double monto) {
        this.saldo-=monto;
    }
}
