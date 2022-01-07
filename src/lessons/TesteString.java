package lessons;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Alura";

        String andAnotherOne = nome.replace('A', 'a');

        System.out.println(nome);
        System.out.println(andAnotherOne);

        CharSequence sequence = "Here goes nothing...";
        StringBuilder builder = new StringBuilder(sequence);
        builder.append(" and now here's something?");
        builder.setCharAt(builder.toString().indexOf('?'), '!');

        @SuppressWarnings("StringOperationCanBeSimplified")
        String result = new String(builder.toString());

        System.out.println("Result: " + result);
    }
}
