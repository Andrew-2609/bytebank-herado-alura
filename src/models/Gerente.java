package models;

public class Gerente extends Funcionario {
    private int senha;

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    /*public double getBonificacao() {
        return this.salario * 0.1;
    }*/
}
