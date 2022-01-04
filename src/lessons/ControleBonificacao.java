package lessons;

import models.EditorDeVideos;
import models.Funcionario;
import models.Gerente;

public class ControleBonificacao {

    private double soma;

    public void registrarBonificacao(Gerente gerente) {
        double bonificacao = gerente.getBonificacao();
        this.soma += bonificacao;
    }

    public void registrarBonificacao(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }

    public void registrarBonificacao(EditorDeVideos editorDeVideos) {
        double bonificacao = editorDeVideos.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
