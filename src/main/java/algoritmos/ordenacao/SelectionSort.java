package algoritmos.ordenacao;

public class SelectionSort {

    public int[] selectionSort(int [] array) {
        for (int i = 0; i < array.length ; i ++) {
            System.out.println();
            for( int c = 0; c < array.length; c ++) {
                if(array[i] < array[c]){
                    int troca1 = array[i];
                    int troca2 = array[c];

                    array[i] = troca2;
                    array[c] = troca1;
                }
            }
        }
        return array;
    }
}
