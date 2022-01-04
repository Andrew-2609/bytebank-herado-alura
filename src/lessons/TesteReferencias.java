package lessons;

import models.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Andrew Johnson");
        gerente.setSalario(5000.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registrarBonificacao(gerente);

        System.out.println(controleBonificacao.getSoma());
    }
}
