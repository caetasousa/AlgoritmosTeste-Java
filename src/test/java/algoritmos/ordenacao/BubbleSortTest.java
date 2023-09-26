package algoritmos.ordenacao;

import algoritmos.ordenacao.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void ordenarEntradaBubbleSort() {

        int[] numeros = {1,7,3,2,9,0,5,8,4,6};
        int[] esperado = {0,1,2,3,4,5,6,7,8,9};

        BubbleSort bubbleSort = new BubbleSort();

        assertArrayEquals(esperado, bubbleSort.ordenarEntrada(numeros));
    }
}