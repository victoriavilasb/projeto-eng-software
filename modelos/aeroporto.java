package modelos;

public class Aeroporto {
    private String nome;

    public Aeroporto(){
        this.nome = "";
    }

    public Aeroporto(String nome){
        this.nome = nome;
    }

    public String getNome () {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }
}
