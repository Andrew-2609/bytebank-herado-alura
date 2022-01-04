package lessons;

import models.Funcionario;

public class ControleBonificacao {

    private double soma;

    public void registrarBonificacao(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
