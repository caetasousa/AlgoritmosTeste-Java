package algoritmos.busca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {
    int[] array;
    BuscaBinaria buscaBinaria;

    @BeforeEach
    void setUp() {
        array = new int[]{0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        buscaBinaria = new BuscaBinaria();
    }

    @Test
    void inicioMaiorQueFim() {
        int resultado = buscaBinaria.busca(array,30, array.length, 100);
        assertEquals(-1, resultado);
    }

    void buscandoIgualResultado() {
        int resultado = buscaBinaria.busca(array,0, array.length, 100);
        assertEquals(100, resultado);
    }
}