package Cuentas;

import Clientes.Cliente;

public abstract class Cuenta {
    protected String tipoCuenta;
    protected Double impuestoCV;
    protected Double impuestoCC;
    protected Cliente cliente;
    protected int idCuenta;
    protected Double saldo;
    private int cantCuentas= 1;
    public Cuenta(Cliente cliente){
        this.cliente=cliente;
        this.idCuenta=this.cantCuentas;
        this.cantCuentas++;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getCantCuentas() {
        return cantCuentas;
    }

    public Double getImpuestoCV() {
        return impuestoCV;
    }

    public void setImpuestoCV(Double impuestoCV) {
        this.impuestoCV = impuestoCV;
    }

    public Double getImpuestoCC() {
        return impuestoCC;
    }

    public void setImpuestoCC(Double impuestoCC) {
        this.impuestoCC = impuestoCC;
    }
    public void setCantCuentas(int cantCuentas) {
        this.cantCuentas = cantCuentas;
    }

    //Metodos abstracto
    public abstract Boolean saldoValido(Double retiro);

    public abstract void deposito(Double monto);

    public abstract void retiro(Double monto);

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
