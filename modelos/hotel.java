package modelos;

public class Hotel {
    
    public String nome;
    public String vagas;
    public String diariaInicial;

    public Hotel(){

        this.nome = "";
        this.vagas = "";
        this.diariaInicial = "";
    }

    public Hotel(Hotel inputHotel){

        this.nome = inputHotel.nome;
        this.vagas = inputHotel.vagas;
        this.diariaInicial = inputHotel.diariaInicial;
    }
}
