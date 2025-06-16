public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");

        // Tipo que mais usaremos:
        // Tipo Wrapper
        String nome = "Ebyyyy";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false;

        // Tipo primitivo
        int contador = 10;
        double valor = 1.22;

        exibirSoma(10.0, 20.1);
        exibirSomaComNome(10.0, 32.1, nome);
    }

    // Método para somar dois números e exibir o resultado
    public static void exibirSoma(Double numero1, Double numero2) {
        Double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);
    }

    // Método para somar dois números e exibir o nome junto com o resultado
    public static void exibirSomaComNome(Double numero1, Double numero2, String nome) {
        Double soma = numero1 + numero2;
        System.out.println("Olá " + nome + ", a soma dos números é: " + soma);
    }
}
