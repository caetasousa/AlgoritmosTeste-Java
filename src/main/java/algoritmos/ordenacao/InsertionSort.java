package algoritmos.ordenacao;

public class InsertionSort {

    public int[] ordena(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int atual = i;

            while(atual > 0) {
                if(array[atual] < array[atual -1]) {
                    int temp1 = array[atual];
                    int temp2 = array[atual -1];

                    array[atual] = temp2;
                    array[atual - 1] = temp1;
                }
                atual--;
            }
        }
        return array;
    }
}
