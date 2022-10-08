package aula05;

import jdk.jshell.Snippet;

import java.sql.SQLOutput;
import java.util.Objects;

public class ContaBanco {
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean abrirConta;

    public boolean isAbrirConta() {
        return abrirConta;
    }

    public void setAbrirConta(boolean abrirConta) {
        this.abrirConta = abrirConta;
    }

    public ContaBanco(String tipo, String dono, float saldo) {
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        if(Objects.equals(tipo, "CC")){
            this.saldo += 50;
        }else{
            this.saldo += 150;
        }

    }
    public void status() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void retirarDinheiro(float dinheiro){
        this.saldo -= dinheiro;
    }

    public void adicionarDinheiro(float dinheiro){
        this.saldo += dinheiro;
    }
}
