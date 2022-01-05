package models;

public class Administrador extends Autenticavel {
    @Override
    public double getBonificacao() {
        return super.getSalario() / 2;
    }
}
