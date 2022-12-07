package solid_srp_v1;


public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("NomeLivro", "nomeAutor", 2000, 10, "989-0-733-9987-5");
       Livro livro2 = new Livro("NomeLivro1", "nomeAutor1", 2001, 19.91, "989-0-733-9987-5");

        Fatura fatura = new Fatura(livro1,1, 0, 0.3);

        ImpressaoDeFatura impressaoDeFatura = new ImpressaoDeFatura(fatura);

        impressaoDeFatura.imprimir();
    }
}
