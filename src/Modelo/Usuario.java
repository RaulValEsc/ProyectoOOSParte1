package Modelo;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable{
    int id;
    String nombre;
    Double saldo;
    Date fNacimiento;

    public Usuario(int id, String nombre, Double saldo, Date fNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.saldo = saldo;
        this.fNacimiento = fNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
}
