package lessons;

import models.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Andrew Monteiro");
        funcionario.setSalario(2000.0);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());
    }
}
