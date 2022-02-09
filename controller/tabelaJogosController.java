package controller;

import model.TabelaJogos;

public class TabelaJogosController extends TabelaJogos{

    private TabelaJogos tabelaJogos;

    public TabelaJogosController(){
        
        this.tabelaJogos = new TabelaJogos();
    }

    public void buildDataBase() {
        
        this.tabelaJogos.buildRelations();
    }

    public void listaJogosCopa() {
        
        this.tabelaJogos.listaTabelaDeJogos();
    }

    public void listaEquipes() {
        
        this.tabelaJogos.listaEquipesParticipantes();
    }

    public void listaEstadios() {
        
        this.tabelaJogos.listaEstadios();
    }

    public void listaAeroportosProximos() {
        
        this.tabelaJogos.listaEstadiosAeroportosProximos();
    }

    public void listaHoteisProximos() {
        
        this.tabelaJogos.listaEstadiosHoteisProximos();
    }
}