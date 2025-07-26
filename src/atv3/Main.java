package atv3;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.setTitulo("Titulo 1");
        livro2.setTitulo("Titulo 2");
        livro3.setTitulo("Titulo 3");
        livro1.setAutor("Autor");
        livro2.setAutor("Autor");
        livro3.setAutor("Autor");
        livro1.setAnoDePublicacao(2008);
        livro2.setAnoDePublicacao(2008);
        livro3.setAnoDePublicacao(2008);

        System.out.println(livro1.getTitulo());
        System.out.println(livro2.getTitulo());
        System.out.println(livro3.getTitulo());
        System.out.println(livro1.getAutor());
        System.out.println(livro2.getAutor());
        System.out.println(livro3.getAutor());
        System.out.println(livro1.getAnoDePublicacao());
        System.out.println(livro2.getAnoDePublicacao());
        System.out.println(livro3.getAnoDePublicacao());
    }
}
