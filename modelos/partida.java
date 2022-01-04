package modelos;

public class partida {
    
    public String data;
    public String horario;

    public partida(){

        this.data = "";
        this.horario = "";
    }

    public partida(partida inputPartida){

        this.data = inputPartida.data;
        this.horario = inputPartida.horario;
    }
}
