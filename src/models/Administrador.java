package models;

import utils.AutenticacaoUtil;

public class Administrador extends Funcionario implements Autenticavel {

    private final AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() / 2;
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
