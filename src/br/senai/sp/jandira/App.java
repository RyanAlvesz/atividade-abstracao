package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;

public class App {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Ryan");
        gerente.setId(89);
        gerente.setBonusGerente(4000);
        gerente.calcularSalario();

        Programador programador = new Programador();
        programador.setNome("Gabriela");
        programador.setId(13);
        programador.setHorasTrabalhadas(5);
        programador.calcularSalario();

        System.out.println("========== Gerente ==========");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Id: " + gerente.getId());
        System.out.println("Salário: " + gerente.getSalarioBase());

        System.out.println("");

        System.out.println("======== Funcionário ========");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Id: " + programador.getId());
        System.out.println("Salário: " + programador.getSalarioBase());



    }

}
