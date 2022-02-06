package modelos;

public class equipe {
    
    public String nome;
    public String tecnico;

    public equipe(){

        this.nome = "";
        this.tecnico = "";
    }

    public equipe(equipe inputEquipe){

        this.nome = inputEquipe.nome;
        this.tecnico = inputEquipe.tecnico;
    }
}
