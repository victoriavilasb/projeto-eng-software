package model;

public class Equipe {
    public String nome;
    public String tecnico;

    public Equipe(){
        this.nome = "";
        this.tecnico = "";
    }

    public Equipe(Equipe inputEquipe){
        this.nome = inputEquipe.nome;
        this.tecnico = inputEquipe.tecnico;
    }
}
