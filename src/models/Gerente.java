package models;

public class Gerente extends Funcionario {
    public double getBonificacao() {
        return super.getSalario();
    }
}
