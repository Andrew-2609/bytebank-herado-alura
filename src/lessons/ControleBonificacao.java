package lessons;

import models.Gerente;

public class ControleBonificacao {

    private double soma;

    public void registrarBonificacao(Gerente gerente) {
        double bonificacao = gerente.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
