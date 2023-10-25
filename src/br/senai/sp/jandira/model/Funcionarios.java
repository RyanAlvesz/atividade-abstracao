package br.senai.sp.jandira.model;

abstract class Funcionarios {

    private String nome;
    private int id;
    double salarioBase = 1000;

    public void Funcionarios(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract void calcularSalario();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
