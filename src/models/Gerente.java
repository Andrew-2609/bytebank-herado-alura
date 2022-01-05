package models;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

}
