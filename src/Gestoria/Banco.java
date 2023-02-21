package Gestoria;

import Clientes.Cliente;
import Cuentas.Cuenta;
import Cuentas.CuentaBanco;

import java.util.ArrayList;

public class Banco {
    private Cliente banco;
    private CuentaBanco cuentaBanco;
    private ArrayList<Cliente> clientes;
    private ArrayList<Cuenta> cuentas;
    public Banco(){
        this.banco=new Cliente("banco","garlicia",0000000,"en la esquina", "garlicia");
        cuentaBanco=new CuentaBanco(banco);
    }

    public void deposito(Cuenta cuenta, double monto){
        cuenta.deposito(monto);
    }
    public void retiro(Cuenta cuenta, double monto){
        if(cuenta.saldoValido(monto))
            cuenta.retiro(monto);
    }
    public Cuenta cuentaByid(int id){
        for(int i=0;1< cuentas.size();i++){
            if(cuentas.get(i).getIdCuenta()==id)
                return cuentas.get(i);
        }
        return null;
    }
    public void tranferencia(Cuenta emisor, double monto, Cuenta receptor){
        String tipo=receptor.getTipoCuenta();
        double impuesto=0.0;
        if (tipo=="cc")
            impuesto= emisor.getImpuestoCC();
        else if (tipo=="cv")
            impuesto= emisor.getImpuestoCV();

        if (emisor.saldoValido(monto + impuesto)){
            emisor.retiro(monto + impuesto);
            receptor.deposito(monto);
            cuentaBanco.deposito(impuesto);
        }
    }
}
