package test.java;

import modelos.Estadio;
import modelos.Hotel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EstadioTest {

    public Estadio getEstadioMock() {
        return new Estadio(
                "Mineirao",
                "MG",
                "Belo Horizonte",
                "Pampulha",
                "Av. Antonio Abrahao Caram",
                1001
        );
    }

    @Test
    public void estadioConstrutor_Vazio() {
        Estadio estadio = new Estadio();
        assertEquals(estadio.getHoteisProximos(), new ArrayList<Hotel>());
    }

    @Test
    public void estadioConstrutor_DadosBasicosCheio() {
        Estadio estadio = this.getEstadioMock();

        assertEquals(estadio.getNome(), "Mineirao");
        assertEquals(estadio.getEstado(), "MG");
        assertEquals(estadio.getCidade(), "Belo Horizonte");
        assertEquals(estadio.getBairro(), "Pampulha");
        assertEquals(estadio.getRua(), "Av. Antonio Abrahao Caram");
        assertEquals(estadio.getNumero(), 1001);
    }

    @Test
    public void estadio_DadosBasicosCheio_ResumoDoEstadio() {
        Estadio estadio = this.getEstadioMock();

        assertNotNull(estadio.getResumoDoEstadio());

        assertEquals(estadio.getResumoDoEstadio(), "\n Estadio Mineirao\n" +
                " MG - Av. Antonio Abrahao Caram, 1001 - Pampulha, Belo Horizonte\n\n");
    }
}
