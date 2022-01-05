package models;

public class Gerente extends FuncionarioAutenticavel {
    public double getBonificacao() {
        return super.getSalario();
    }
}
