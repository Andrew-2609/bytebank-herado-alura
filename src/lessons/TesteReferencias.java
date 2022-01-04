package lessons;

import models.Funcionario;
import models.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Andrew Johnson");
        gerente.setSalario(5000.0);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Andrew Müller");
        funcionario.setSalario(2000.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registrarBonificacao(gerente);
        controleBonificacao.registrarBonificacao(funcionario);

        System.out.println(controleBonificacao.getSoma());
    }
}
