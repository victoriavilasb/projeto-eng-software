package modelos;

public class hotel {
    
    public String nome;
    public String vagas;
    public String diariaInicial;

    public hotel(){

        this.nome = "";
        this.vagas = "";
        this.diariaInicial = "";
    }

    public hotel(hotel inputHotel){

        this.nome = inputPartida.nome;
        this.vagas = inputPartida.vagas;
        this.diariaInicial = inputPartida.diariaInicial;
    }
}
