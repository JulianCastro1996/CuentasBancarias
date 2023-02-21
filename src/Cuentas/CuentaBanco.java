package Cuentas;

import Clientes.Cliente;

public class CuentaBanco extends Cuenta{
    public CuentaBanco(Cliente cliente){
        super(cliente);
        this.impuestoCC=0.0;
        this.impuestoCV=0.0;
        this.tipoCuenta="cb";
    }
    @Override
    public Boolean saldoValido(Double retiro) {
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
