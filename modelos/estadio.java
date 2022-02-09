package modelos;
import java.util.ArrayList;


public class Estadio {

    private String nome;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private Integer numero;

    private ArrayList<Partida> partidasMarcadas = new ArrayList<Partida>();
    private ArrayList<Aeroporto> aeroportosProximos = new ArrayList<Aeroporto>();
    private ArrayList<Hotel> hoteisProximos = new ArrayList<Hotel>();

    public Integer getNumero () {
        return this.numero;
    }

    public String getRua () {
        return this.rua;
    }


    public String getBairro () {
        return this.bairro;
    }


    public String getCidade () {
        return this.cidade;
    }

    public String getEstado () {
        return this.estado;
    }

    public String getNome() {
        return this.nome;
    }

    public ArrayList<Hotel> getHoteisProximos() {
        return this.hoteisProximos;
    }

    public void setHoteisProximos(Hotel hotel) {
        this.hoteisProximos.add(hotel);
    }

    public ArrayList<Aeroporto> getAeroportosProximos() {
        return this.aeroportosProximos;
    }

    public void setAeroportosProximos(Aeroporto aeroporto) {
        this.aeroportosProximos.add(aeroporto);
    }

    public ArrayList<Partida> getPartidasMarcadas() {
        return this.partidasMarcadas;
    }

    public void setPartidasMarcadas(Partida partida) {
        this.partidasMarcadas.add(partida);
    }

    public Estadio() {
        this.nome = "";
        this.estado = "";
        this.cidade = "";
        this.bairro = "";
        this.rua = "";
        this.numero = 0;

        this.partidasMarcadas = new ArrayList<Partida>();
        this.aeroportosProximos = new ArrayList<Aeroporto>();
        this.hoteisProximos = new ArrayList<Hotel>();
    }

    public Estadio(String nome, String estado, String cidade, String bairro, String rua, Integer numero) {
        this.nome = nome;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Estadio(Estadio inputEstadio){

        this.nome = inputEstadio.nome;
        this.estado = inputEstadio.estado;
        this.cidade = inputEstadio.cidade;
        this.bairro = inputEstadio.bairro;
        this.rua = inputEstadio.rua;
        this.numero = inputEstadio.numero;

        this.partidasMarcadas = inputEstadio.partidasMarcadas;
        this.aeroportosProximos = inputEstadio.aeroportosProximos;
        this.hoteisProximos = inputEstadio.hoteisProximos;
    }

    public String getResumoDoEstadio() {
        return (
                "\n Estadio " + this.nome + "\n" +
                " " + this.estado + " - " + this.rua + ", " + this.numero + " - " + this.bairro + ", " + this.cidade + "\n\n"
        );
    }
}
