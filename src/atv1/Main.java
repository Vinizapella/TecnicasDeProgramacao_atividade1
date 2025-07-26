package atv1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Joao";
        p2.nome = "Victoria";
        p1.idade = 18;
        p2.idade = 16;
        System.out.println(p1.nome + " " + p2.nome);
        System.out.println(p1.idade + " " + p2.idade);
    }
}
