package atv1;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(){
        this.nome = "";
        this.idade = 0;
    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
