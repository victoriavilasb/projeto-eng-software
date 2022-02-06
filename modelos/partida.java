package modelos;

public class partida {
    
    public String data;
    public String horario;
    public String valorIngresso;
    public String confronto;

    public partida(){

        this.data = "";
        this.horario = "";
        this.valorIngresso = "";
    }

    public partida(partida inputPartida){

        this.data = inputPartida.data;
        this.horario = inputPartida.horario;
        this.valorIngresso = inputPartida.valorIngresso;
    }
}
