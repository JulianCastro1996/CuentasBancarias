package Cuentas;

import Clientes.Cliente;

public class CuentaVIP extends Cuenta {
    private double deudaPermitida;
    private int transferenciasCant;
    public CuentaVIP(Cliente cliente){
        super(cliente);
        this.impuestoCC=0.20;
        this.impuestoCV=0.15;
        this.deudaPermitida=-5000.00;
        this.transferenciasCant=1;
        this.tipoCuenta="cv";
    }

    @Override
    public Boolean saldoValido(Double retiro) {
        double result= this.saldo-retiro;
        if (result< deudaPermitida)
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

    @Override
    public Double getImpuestoCV() {
        if(this.transferenciasCant<50)
            return 0.0;
        else
            return impuestoCV;
    }

    @Override
    public Double getImpuestoCC() {
        if(this.transferenciasCant<50)
            return 0.0;
        else
            return impuestoCC;
    }

    public Double getDeudaPermitida() {
        return deudaPermitida;
    }

    public void setDeudaPermitida(Double deudaPermitida) {
        this.deudaPermitida = deudaPermitida;
    }

    public int getTransferenciasCant() {
        return transferenciasCant;
    }

    public void setTransferenciasCant(int transferenciasCant) {
        this.transferenciasCant = transferenciasCant;
    }
}
