package lessons;

import models.EditorDeVideos;
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

        EditorDeVideos editorDeVideos = new EditorDeVideos();
        editorDeVideos.setNome("Carlinhos Guilherme");
        editorDeVideos.setSalario(3000.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registrarBonificacao(gerente);
        controleBonificacao.registrarBonificacao(funcionario);
        controleBonificacao.registrarBonificacao(editorDeVideos);

        System.out.println(controleBonificacao.getSoma());
    }
}
