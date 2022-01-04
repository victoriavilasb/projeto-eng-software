package modelos;
import java.util.ArrayList;


public class estadio {

    public String nome;
    public String estado;
    public String cidade;
    public String bairro;
    public String rua;
    public Integer numero;

    public ArrayList<partida> partidasMarcadas;

    public estadio(){

        this.nome = "";
        this.estado = "";
        this.cidade = "";
        this.bairro = "";
        this.rua = "";
        this.numero = 0;

        this.partidasMarcadas = new ArrayList<partida>();
    }

    public estadio(estadio inputEstadio){

        this.nome = inputEstadio.nome;
        this.estado = inputEstadio.estado;
        this.cidade = inputEstadio.cidade;
        this.bairro = inputEstadio.bairro;
        this.rua = inputEstadio.rua;
        this.numero = inputEstadio.numero;

        this.partidasMarcadas = inputEstadio.partidasMarcadas;
    }
}
