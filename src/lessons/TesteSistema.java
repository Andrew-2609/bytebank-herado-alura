package lessons;

import models.Administrador;
import models.Cliente;
import models.Gerente;
import models.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autenticar(gerente);
        sistemaInterno.autenticar(administrador);
        sistemaInterno.autenticar(cliente);
    }
}
