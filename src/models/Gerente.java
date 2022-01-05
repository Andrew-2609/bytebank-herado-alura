package models;

public class Gerente extends Autenticavel {
    public double getBonificacao() {
        return super.getSalario();
    }
}
