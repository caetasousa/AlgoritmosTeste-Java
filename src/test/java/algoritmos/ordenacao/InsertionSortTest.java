package algoritmos.ordenacao;

import algoritmos.ordenacao.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void ordenaInsertionSort() {

        int[] numeros = {1,7,3,2,9,0,5,8,4,6};
        int[] esperado = {0,1,2,3,4,5,6,7,8,9};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.ordena(numeros);
        assertArrayEquals(esperado, insertionSort.ordena(numeros));
    }
}