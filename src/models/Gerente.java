package models;

import utils.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {

    private final AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

}
