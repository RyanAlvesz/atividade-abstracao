package br.senai.sp.jandira.model;

public class Gerente extends Funcionarios{

    private double bonusGerente;

    @Override
    public void calcularSalario() {
        setSalarioBase(getSalarioBase() + getBonusGerente());
    }

    public double getBonusGerente() {
        return bonusGerente;
    }

    public void setBonusGerente(double bonusGerente) {
        this.bonusGerente = bonusGerente;
    }
}
