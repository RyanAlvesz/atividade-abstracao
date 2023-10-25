package br.senai.sp.jandira.model;

public class Programador extends Funcionarios{

    int horasTrabalhadas;
    @Override
    public void calcularSalario() {

            setSalarioBase(getSalarioBase() + (100 * getHorasTrabalhadas()));
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
