package algoritmos.busca;

public class BuscaBinaria {

    public int busca(int[] array, int inicio, int fim, int buscando) {
        if (inicio > fim) {
            return -1;
        }
        int meio = (inicio + fim) / 2;

        if (array[meio] == buscando) {
            return array[meio];
        }

        if ( array[meio] > buscando) {
            return busca(array, inicio, meio -1, buscando);
        }

        return busca(array, meio + 1 , fim, buscando);
    }
}
