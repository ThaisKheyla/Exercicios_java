public class Teste {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno();
        aluno01.nome = "Bob";
        aluno01.nota = 8.9;
        aluno01.ra = "COD001";

        Aluno aluno02 = new Aluno();
        aluno02.nome = "Tom";
        aluno02.nota = 9.9;
        aluno02.ra = "COD002";

        aluno01.exibirAluno();
        aluno02.exibirAluno();

    }
}
