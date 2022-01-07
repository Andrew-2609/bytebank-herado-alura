package lessons;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Alura";
        // String nome = new String("Alura");

        String andAnotherOne = nome.replace('A', 'a');

        System.out.println(nome);
        System.out.println(andAnotherOne);
    }
}
