package models;

public class SistemaInterno {

    private final int senha = 2222;

    public void autenticar(Autenticavel autenticavel) {
        boolean autenticou = autenticavel.autenticar(this.senha);
        if (autenticou) {
            System.out.println("Funcionário pode entrar no sistema!");
        } else {
            System.out.println("Funcionário não pode entrar no sistema!");
        }
    }

}
