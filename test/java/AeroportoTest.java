
package test.java;

import modelos.Aeroporto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AeroportoTest {

    @Test
    public void aeroportoConstrutor_Vazio() {
        Aeroporto aeroporto = new Aeroporto();
        assertEquals(aeroporto.getNome(), "");
    }

    @Test
    public void aeroportoConstrutor_Nome() {
        Aeroporto aeroporto = new Aeroporto("Pampulha");
        assertEquals(aeroporto.getNome(), "Pampulha");
    }
}