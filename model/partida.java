package model;

public class Partida {
    
    public String data;
    public String horario;
    public String valorIngresso;
    public String confronto;

    public Partida(){

        this.data = "";
        this.horario = "";
        this.valorIngresso = "";
    }

    public Partida(Partida inputPartida){

        this.data = inputPartida.data;
        this.horario = inputPartida.horario;
        this.valorIngresso = inputPartida.valorIngresso;
    }
}
