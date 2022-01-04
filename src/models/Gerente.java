package models;

public class Gerente extends Funcionario {
    private int senha;

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    /*public double getBonificacao() {
        return this.salario * 0.1;
    }*/
}
