package utils;

public class AutenticacaoUtil {

    private int senha;

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
