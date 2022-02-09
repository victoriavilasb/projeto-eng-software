package controller;

import model.Aeroporto;

public class AeroportoController {
    public Aeroporto setAeroporto(string name) {
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.setNome(name);
        return aeroporto;
    }
}