package lessons;

import models.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Marco");
        gerente.setCpf("332.887.554-11");
        gerente.setSalario(5000.0);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());

        gerente.setSenha(1234);

        if (gerente.autenticar(4432)) {
            System.out.println("As senhas batem.");
        }

        System.out.println(gerente.getBonificacao());
    }
}
